/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package org.smartloli.hive.cube.common.pojo;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

/**
 * HBaseSchema pojo.
 * 
 * @author smartloli.
 *
 *         Created by Jul 10, 2017
 */
public class HBaseSchema {

	private JSONObject schema;
	private String sql;

	public JSONObject getSchema() {
		return schema;
	}

	public void setSchema(JSONObject schema) {
		this.schema = schema;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
