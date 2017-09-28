/**
 * 
 */
package com.bigflag.toolkit.tool.socket.beans;

/***
 * 
 * Copyright 2017-2027 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Eric,Liu<br> 
 *		   mail:     34223022@qq.com<br>
 *         Create at:2017年9月28日 下午3:27:13
 */
public final class SocketSessionMsgBean {
	private final long sessionID;
	private final String senderID;
	private final byte[] data;
	
	public SocketSessionMsgBean(Builder builder)
	{
		this.sessionID=builder.sessionID;
		this.senderID=builder.senderID;
		this.data=builder.data;
	}
	
	public static class Builder{
		private long sessionID;
		private String senderID;
		private byte[] data;

		public Builder(long sessionID) {
			this.sessionID = sessionID;
		}

		public void setSessionID(long sessionID) {
			this.sessionID = sessionID;
		}

		public void setSenderID(String senderID) {
			this.senderID = senderID;
		}

		public void setData(byte[] data) {
			this.data = data;
		}
		
		public SocketSessionMsgBean build()
		{
			return new SocketSessionMsgBean(this);
		}
	}

	public long getSessionID() {
		return sessionID;
	}

	public String getSenderID() {
		return senderID;
	}

	public byte[] getData() {
		return data;
	}
	
	
}