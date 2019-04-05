
public class Stuffy {
	private String color;
	private String type;
	private String size;
	
	public Stuffy() {
		super();
	}

	public Stuffy(String color, String type, String size) {
		super();
		this.color = color;
		this.type = type;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Stuffy [color=" + color + ", type=" + type + ", size=" + size + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Stuffy) {
			Stuffy s = (Stuffy)obj;
			if (this.color.equals(s.getColor()) &&
				this.size.equals(s.getSize()) &&
					this.type.equals(s.getType())) {
				return true;
			}
		}
		return false;
	}
	
	
}
