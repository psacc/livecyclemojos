/*
 * Copyright (c) 2011, David Beale
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
 */

package com.bealearts.livecycle.lca;


/**
 * Models a Reference between LiveCycle applications
 */
public class Reference
{
	/* PUBLIC */
	
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	public String getApplicationVersion() {
		return applicationVersion;
	}
	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
	
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	
	
	/**
	 * Major version from version
	 */
	public String getApplicationMajorVersion()
	{
		if (this.applicationVersion == null)
			return "";
		else
			return this.applicationVersion.substring( 0, this.applicationVersion.indexOf('.') );
	}
	
	
	/**
	 * Minor version from version
	 */
	public String getApplicationMinorVersion()
	{
		if (this.applicationVersion == null)
			return "";
		else
			return this.applicationVersion.substring( this.applicationVersion.indexOf('.')+1 );
	}	
	
	
	/* PRIVATE */

	private String applicationName;
	private String applicationVersion;
	private String objectName;

}