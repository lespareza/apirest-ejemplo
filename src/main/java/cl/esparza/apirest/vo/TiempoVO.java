package cl.esparza.apirest.vo;

public class TiempoVO {
	private String status;
	private String location;
	private String url;
	private TiempoUno day;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public TiempoUno getDay() {
		return day;
	}
	public void setDay(TiempoUno day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "TiempoVO [status=" + status + ", location=" + location + ", url=" + url + ", day=" + day + "]";
	}

}

class TiempoUno{
	String date;
	String name;
	String month;
	String symbol_value;
	String symbol_description;
	String symbol_value2;
	String symbol_description2;
	String tempmin;
	String tempmax;
	String wind;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSymbol_value() {
		return symbol_value;
	}
	public void setSymbol_value(String symbol_value) {
		this.symbol_value = symbol_value;
	}
	public String getSymbol_description() {
		return symbol_description;
	}
	public void setSymbol_description(String symbol_description) {
		this.symbol_description = symbol_description;
	}
	public String getSymbol_value2() {
		return symbol_value2;
	}
	public void setSymbol_value2(String symbol_value2) {
		this.symbol_value2 = symbol_value2;
	}
	public String getSymbol_description2() {
		return symbol_description2;
	}
	public void setSymbol_description2(String symbol_description2) {
		this.symbol_description2 = symbol_description2;
	}
	public String getTempmin() {
		return tempmin;
	}
	public void setTempmin(String tempmin) {
		this.tempmin = tempmin;
	}
	public String getTempmax() {
		return tempmax;
	}
	public void setTempmax(String tempmax) {
		this.tempmax = tempmax;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	@Override
	public String toString() {
		return "TiempoUno [date=" + date + ", name=" + name + ", month=" + month + ", symbol_value=" + symbol_value
				+ ", symbol_description=" + symbol_description + ", symbol_value2=" + symbol_value2
				+ ", symbol_description2=" + symbol_description2 + ", tempmin=" + tempmin + ", tempmax=" + tempmax
				+ ", wind=" + wind + "]";
	}

}
