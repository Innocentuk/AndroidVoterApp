package com.appandrunning.favourben.androidvoterapp;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Handler;

/**
 * Created by Eucheria on 20/05/2015.
 */
public class VoteClient implements Runnable{
    
    private String serverMessage;
    public static final String SERVERIP = "188.181.85.75"; //your computer IP address
    public static final int SERVERPORT = 8080;
    public static final int BUFFER_SIZE = 2048;
    
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
   // private MessageCommand messageListener = null;
    private String msg = "";
    private boolean mRun = false;
    
       // @Override
        public void run() {

            try {
                InetAddress serverAddr = InetAddress.getByName(SERVERIP);

                socket = new Socket(serverAddr, SERVERPORT);

            } catch (UnknownHostException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            while (!Thread.currentThread().isInterrupted()){
                
            }
        }
    private void writeTotheServer() {
        try {
            if (socket == null) {
                out = new PrintWriter(socket.getOutputStream(), true);
                String message = "Hello from client!";
                out.write(message);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void disConnectWithServer() {
        if (socket != null) {
            if (socket.isConnected()) {
                try {
                    in.close();
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String receiveDataFromServer() {
        try {
            String message = "";
            int charsRead = 0;
            char[] buffer = new char[BUFFER_SIZE];

            while ((charsRead = in.read(buffer)) != -1) {
                message += new String(buffer).substring(0, charsRead);
            }

            disConnectWithServer(); // disconnect server
            return message;
        } catch (IOException e) {
            return "Error receiving response:  " + e.getMessage();
        }
    }



}
    /*PrintWriter out;
    BufferedReader in;*/
    
    /**
     *  Constructor of the class. OnMessagedReceived listens for the messages received from server
     * @param listener
     */
    //public VoteClient(String listener) {
        //msg = listener;
    //}

    /**
     * Sends the message entered by client to the server
     * @param message text entered by client
     */
    /*public void sendMessage(String message){
        if (out != null && !out.checkError()) {
            out.println(message);
            out.flush();
        }
    }

    public void stopClient(){
        mRun = false;
    }
    public void run() {

        mRun = true;

        try {
            //here you must put your computer's IP address.
            InetAddress serverAddr = InetAddress.getByName(SERVERIP);

            Log.e("TCP Client", "C: Connecting...");

            //create a socket to make the connection with the server
            Socket socket = new Socket(serverAddr, SERVERPORT);

            try {

                //send the message to the server
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

                Log.e("TCP Client", "C: Sent.");

                Log.e("TCP Client", "C: Done.");

                //receive the message which the server sends back
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //in this while the client listens for the messages sent by the server
                while (mRun) {
                    serverMessage = in.readLine();

                    if (serverMessage != null && mMessageListener != null) {
                        //call the method messageReceived from MyActivity class
                        mMessageListener.messageReceived(serverMessage);
                    }
                    serverMessage = null;

                }

                Log.e("RESPONSE FROM SERVER", "S: Received Message: '" + serverMessage + "'");

            } catch (Exception e) {

                Log.e("TCP", "S: Error", e);

            } finally {
                //the socket must be closed. It is not possible to reconnect to this socket
                // after it is closed, which means a new socket instance has to be created.
                socket.close();
            }

        } catch (Exception e) {
            Log.e("TCP", "C: Error", e);
        }*/

