package com.ksyun.ks3.model;

import java.util.HashMap;
import java.util.Map;

public class LogRecord {
	private String source_ip;
	private String target_ip;
	private String model;
	private String manufacturer;
	private String id;
	private String network_type;
	private String build_version;
	private String first_data_time;
	private String responce_time;
	private String responce_size;
	private String client_state;
	private String error;
	private String requestId;
	private String connect_type;
	private long send_before_time;
	private long send_first_data_time;
	private long send_complete_time;

	public void copyRecord(LogRecord record) {
		setBuild_version(record.getBuild_version());
		setClient_state(record.getClient_state());
		setConnect_type(record.getConnect_type());
		setError(record.getError());
		setFirst_data_time(record.getFirst_data_time());
		setId(record.getId());
		setManufacturer(record.getManufacturer());
		setModel(record.getModel());
		setNetwork_type(record.getNetwork_type());
		setRequestId(record.getRequestId());
		setResponce_size(record.getResponce_size());
		setResponce_time(record.getResponce_time());
		setSend_before_time(record.getSend_before_time());
		setSend_complete_time(record.getSend_complete_time());
		setSend_first_data_time(record.getSend_first_data_time());
		setSource_ip(record.getSource_ip());
		setTarget_ip(record.getTarget_ip());

	}

	public long getSend_before_time() {
		return send_before_time;
	}

	public void setSend_before_time(long send_before_time) {
		this.send_before_time = send_before_time;
	}

	public long getSend_first_data_time() {
		return send_first_data_time;
	}

	public void setSend_first_data_time(long send_first_data_time) {
		this.send_first_data_time = send_first_data_time;
	}

	public long getSend_complete_time() {
		return send_complete_time;
	}

	public void setSend_complete_time(long send_complete_time) {
		this.send_complete_time = send_complete_time;
	}

	public String getConnect_type() {
		return connect_type;
	}

	public void setConnect_type(String connect_type) {
		this.connect_type = connect_type;
	}

	public String getBuild_version() {
		return build_version;
	}

	public void setBuild_version(String build_version) {
		this.build_version = build_version;
	}

	public String getSource_ip() {
		return source_ip;
	}

	public void setSource_ip(String source_ip) {
		this.source_ip = source_ip;
	}

	public String getTarget_ip() {
		return target_ip;
	}

	public void setTarget_ip(String target_ip) {
		this.target_ip = target_ip;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNetwork_type() {
		return network_type;
	}

	public void setNetwork_type(String network_type) {
		this.network_type = network_type;
	}

	public String getFirst_data_time() {
		return first_data_time;
	}

	public void setFirst_data_time(String first_data_time) {
		this.first_data_time = first_data_time;
	}

	public String getResponce_time() {
		return responce_time;
	}

	public void setResponce_time(String responce_time) {
		this.responce_time = responce_time;
	}

	public String getResponce_size() {
		return responce_size;
	}

	public void setResponce_size(String responce_size) {
		this.responce_size = responce_size;
	}

	public String getClient_state() {
		return client_state;
	}

	public void setClient_state(String client_state) {
		this.client_state = client_state;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("***log_record_begin***");
		buffer.append("\nsource_ip = " + source_ip);
		buffer.append("\ntarget_ip = " + target_ip);
		buffer.append("\nmodel = " + model);
		buffer.append("\nmanufacturer = " + manufacturer);
		buffer.append("\nid = " + id);
		buffer.append("\nnetwork_type = " + connect_type);
		buffer.append("\nbuild_version = " + build_version);
		buffer.append("\nsendTime=" + String.valueOf(getSend_before_time()));
		buffer.append("\nfirst_data_time = " + getSend_first_data_time());
		buffer.append("\nresponce_time = "
				+ String.valueOf(getSend_complete_time()));
		buffer.append("\nresponce_size = " + responce_size);
		buffer.append("\nclient_state = " + client_state);
		buffer.append("\nerror = " + error);
		buffer.append("\nrequestIdr = " + requestId);
		buffer.append("\nconnect_type = " + network_type);
		buffer.append("\n***log_record_end***");
		return buffer.toString();
	}

	public Map<String, String> toHashMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("LogSourceIp", getSource_ip());
		map.put("LogTargetIp", getTarget_ip());
		map.put("LogModel", getModel());
		map.put("LogManufacturer", getManufacturer());
		map.put("LogBuildVersion", getBuild_version());
		map.put("LogDeviceId", getId());
		map.put("LogNetworkType", getConnect_type());
		map.put("LogFirstDataTime", String.valueOf(getSend_first_data_time()));
		map.put("LogResponseTime", String.valueOf(getSend_complete_time()));
		map.put("LogSendTime", String.valueOf(getSend_before_time()));
		map.put("LogResponseSize", getResponce_size());
		map.put("LogClientState", getClient_state());
		map.put("LogMobileNetworkType", getNetwork_type());
		map.put("LogError", getError());
		map.put("LogRequestId", getRequestId());
		return map;

	}

}