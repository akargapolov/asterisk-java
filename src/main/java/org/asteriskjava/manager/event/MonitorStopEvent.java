/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * A MonitorStopEvent indicates that monitoring was stopped on a channel.<p>
 * Available since Asterisk 1.6.<p>
 * It is defined in <code>res/res_monitor.c</code>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class MonitorStopEvent extends AbstractMonitorEvent
{
    public MonitorStopEvent(Object source)
    {
        super(source);
    }
}