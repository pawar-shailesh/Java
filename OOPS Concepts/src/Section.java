/**
 * Class Section with setter and Getter methods.
 */
public class Section {
		private String id;
		private String name;
		private String createdDate;
		 

		public void setId(String id) 
		{
	    		this.id=id;
		}

		public String getId()
		{
			return this.id;
		}


		public void setName(String name) 
		{
	    		this.name=name;
		}

		public String getName()
		{
			return this.name;
		}
		

		public void setCreatedDate(String createdDate) 
		{
	    		this.createdDate=createdDate;
		}

		public String getCreatedDate()
		{
			return this.createdDate;
		}


		public String showSectionDetail() 
		{
	        return "Id: "+getId()+"\nName: "+getName()+"\nCreatedDate: "+getCreatedDate();
	    	}

		public static void main(String args[])
		{
			Section obj = new Section();
			obj.setId("1012");
			obj.setName("Java");
			obj.setCreatedDate("12/07/2021");
			
			System.out.println(obj.showSectionDetail());
		}
	}

