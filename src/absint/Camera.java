package absint;

public abstract class Camera {
	
	public String CameraName;
	
	{
		CameraName = "HPE";
	}
	
	abstract public void lens();

	/**
	 * @return the cameraName
	 */
	public String getCameraName() {
		return CameraName;
	}

	/**
	 * @param cameraName the cameraName to set
	 */
	public void setCameraName(String cameraName) {
		this.CameraName = cameraName;
	}

}
