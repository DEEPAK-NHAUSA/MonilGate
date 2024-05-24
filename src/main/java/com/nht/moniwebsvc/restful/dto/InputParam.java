package com.nht.moniwebsvc.restful.dto;

public class InputParam {
	private Integer seq_no;
	private String  seq_name;
	public Integer getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(Integer seq_no) {
		this.seq_no = seq_no;
	}
	public String getSeq_name() {
		return seq_name;
	}
	public void setSeq_name(String seq_name) {
		this.seq_name = seq_name;
	}
	@Override
	public String toString() {
		return "InputParam [seq_no=" + seq_no + ", seq_name=" + seq_name + "]";
	}
	
}
