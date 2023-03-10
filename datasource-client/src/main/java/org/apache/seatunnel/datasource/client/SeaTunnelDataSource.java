/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.datasource.client;

import org.apache.seatunnel.datasource.service.SeaTunnelAutoTableService;
import org.apache.seatunnel.datasource.service.SeaTunnelDataSourceService;

import javax.sql.DataSource;

import java.util.concurrent.ConcurrentMap;

public abstract class SeaTunnelDataSource implements SeaTunnelDataSourceService, SeaTunnelAutoTableService {

    /**
     * The data source. we use this to get the connection.
     * if you want to use the connection pool, you can use the connection pool to get the connection.
     */
    protected DataSource dataSource;

    // do not need to init all plugins?
    protected ConcurrentMap<String, SeaTunnelAutoTableService> dataSourceMetaDataServicePluginMap;

}
