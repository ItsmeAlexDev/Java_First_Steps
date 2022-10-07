package com.sample.stack;

public class TestConnection {

	public static void main(String[] args) {

		/*
		 * Trying to do a connecion that is 100% going throw IllegalStateException 
		 *
		 * I can put somethings in the "try" to make a better/cleaner code
		 */
		try (Connection connection = new Connection()) {
			connection.readData();
			connection.close();
		} catch (IllegalStateException ex) {
			System.out.println("Something went wrong in the connection");
		}

		/*
		 * Both the codes above and below do the same thing, but the one above is better 
		 */
//		Connection con = null;
//		try {
//			con = new Connection();
//			con.readData();
//		} catch(IllegalStateException ex) {
//			System.out.println("Something went wrong in the connection");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}

	}

}
