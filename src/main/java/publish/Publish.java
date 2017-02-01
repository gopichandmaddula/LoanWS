/**
 * 
 */
/**
 * @author gopichand
 *
 */
package publish;


import javax.xml.ws.Endpoint;

import trng.imcs.soap.ServiceImpl;

public class Publish {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/loanService", new ServiceImpl());
	}
}