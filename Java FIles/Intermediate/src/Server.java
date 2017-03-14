//chat program
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame {
	
	private JTextField userText;//area where u type
	private JTextArea chatWindow;//displays msgs
	private ObjectOutputStream output;//stream goes from ur computer to friends computer
	//stream sends messages
	private ObjectInputStream input;
	private ServerSocket server;
	//server is used to set up program publicly
	
	private Socket connection; // socket is the connection between one computer and the other computer
	//constructor
	public Server(){
		super("Nexx's IM");
		userText = new JTextField();
		userText.setEditable(false); //before ure not connected you cannot type 
		userText.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						//send message
						sendMessage(event.getActionCommand());//we gotta create this message
					//whatever msg is typed is send
						userText.setText("");//once hit enter, message is gone
						
					}
				}
				
				);
		add(userText,BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
		
	}
//set up and run the server
	public void startRunning(){
		try{
			server = new ServerSocket(6789,100);//port number is 6789,you can give it any number, the progream is there
			//Only 100 ppl are supposed to sit and wait
			while(true){
				//main program runs over and over again
				try{
					waitforConnection();//we make this method
					setupStreams();//set up a connection of streams
					whileChatting();//program that allows us to send messages back and forth
				}catch(EOFException eofException){
					showMessage("\n Server ended the connection");
				//whenever connection ends then this message will pop up
				}finally{
					closeCrap(); // closes all streams. we make this method
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
//wait for connection, then display connection info
	private void waitforConnection() throws IOException{
		showMessage("Waitng for someone to connect");
		connection = server.accept();//once someone wants to connect, it accpets connection
		//only creates socket one time once connected
		showMessage("Now connected to "+connection.getInetAddress().getHostName());
	}
	//get stream to send and receive data
	private void setupStreams() throws IOException{
		//setting up output stream
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		//you cannot flush their stuff
		showMessage("\n Streams are now set up \n");
	}
//during the chat conversation
	private void whileChatting() throws IOException{
		String message = "You are now connected! ";
		sendMessage(message);
		ableToType(true); // this enables ppl to type while chatting
		do{
			//have a conversation
			try{
				message = (String) input.readObject();//we treat their message as an object and make sure its a string and store it
				showMessage("\n"+message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n idk wtf that user send");//if user sends weird stuff then this pops out
			}
		}while(message.equals("CLIENT - END"));//if user types END then conversation stops
	}
//throws crap method. close streams and sockets
	public void closeCrap(){
		showMessage("\n Closing connections...\n");
		ableToType(false); // user cannot type anymore
		try{
			output.close();//output stream closed
			input.close();//input stream closed
			connection.close();//connection closed
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
//send a message to client
	private void sendMessage(String message){
		try{
			output.writeObject("SERVER - "+ message);
			output.flush();
			//now message is seen on screen after being sent
			showMessage("\nServer-" +message);
		}catch(IOException ioException){
			chatWindow.append("\n ERROR: I cannot send the message");//stick this into chat area
			
		}
	}
//show message method..updates chat window
	private void showMessage(final String text){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.append(text);
						//only updates chatwindow 
						//so we dont have to create another gui
					}
				}
			);
	}
//able to typer method
	public void ableToType(final boolean tof){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						userText.setEditable(tof);
						//we update gui
					
					}
				}
			);
		
	}
}


