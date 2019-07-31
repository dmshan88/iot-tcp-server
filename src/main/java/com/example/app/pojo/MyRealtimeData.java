package com.example.app.pojo;

public class MyRealtimeData {
	private int deviceId;
	private long recordTime;
	MyNodeData[] nodeData;

	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public long getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(long recordTime) {
		this.recordTime = recordTime;
	}
	public MyNodeData[] getNodeData() {
		return nodeData;
	}
	public void setNodeData(MyNodeData[] nodeData) {
		this.nodeData = nodeData;
	}
	
}
