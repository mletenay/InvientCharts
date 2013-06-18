/*
 * Copyright 2011 Invient (www.invient.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.invient.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("chartdemo")
public class InvientChartsDemoUI extends UI  {

    private Boolean isAppRunningOnGAE;

    public boolean isAppRunningOnGAE() {
        if (isAppRunningOnGAE == null) {
            return false;
        }
        return isAppRunningOnGAE;
    }

    
    @Override
    protected void init(VaadinRequest request) {
        setContent(new InvientChartsDemoPanel());
        Page.getCurrent().setTitle("Invient Charts");
        Notification.show("To hide a series, click on its legend label.");
    }
    
//    @Override
//    public void onRequestStart(HttpServletRequest request,
//            HttpServletResponse response) {
//        if (isAppRunningOnGAE == null) {
//            isAppRunningOnGAE = false;
//            String serverInfo = request.getSession().getServletContext()
//                    .getServerInfo();
//            if (serverInfo != null && serverInfo.contains("Google")) {
//                isAppRunningOnGAE = true;
//            }
//        }
//    }

}
