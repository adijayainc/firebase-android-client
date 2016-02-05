/**
 # Copyright Google Inc. 2016
 # Licensed under the Apache License, Version 2.0 (the "License");
 # you may not use this file except in compliance with the License.
 # You may obtain a copy of the License at
 #
 # http://www.apache.org/licenses/LICENSE-2.0
 #
 # Unless required by applicable law or agreed to in writing, software
 # distributed under the License is distributed on an "AS IS" BASIS,
 # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 # See the License for the specific language governing permissions and
 # limitations under the License.
 **/

package com.google.cloud.solutions.managedvm.common;

import com.firebase.client.ServerValue;
import java.util.HashMap;

/*
 * An instance of Message represents an actual message pushed to a channel.
 */
public class Message {
    private String text;
    private String displayName;
    private HashMap<String, Object> time;

    public Message() {}

    public Message(String text, String displayName) {
        this.text = text;
        this.displayName = displayName;
        time = new HashMap<String, Object>();
        time.put("date", ServerValue.TIMESTAMP);
    }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public HashMap<String, Object> getTime() { return time; }
}
