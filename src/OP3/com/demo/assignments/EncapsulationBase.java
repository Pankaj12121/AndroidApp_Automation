package OP3.com.demo.assignments;

public class EncapsulationBase {
	private float height, weight;
	 private String color, country;
	     
	 public void setHeight(float h){
	  height = h;
	 }

	 public void setweight(float w){
	  weight = w;
	 }

	 public void setColor(String c){
	  color = c;
	 }

	 public void setCountry(String o){
	  country = o;
	 }

	 float getHeight(){
	  return height;
	 }

	 float getWeight(){
	  return weight;
	 }

	 String getColor(){
	  return color;
	 }

	 String getCountry(){
	  return country;
	 }

}
