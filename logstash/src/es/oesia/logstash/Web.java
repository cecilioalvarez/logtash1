package es.oesia.logstash;

public class Web {

	private String ip;
	private String web;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public Web(String ip, String web) {
		super();
		this.ip = ip;
		this.web = web;
	}
	@Override
	public String toString() {
		return ip + ","+ web;
	}
	
	
}
