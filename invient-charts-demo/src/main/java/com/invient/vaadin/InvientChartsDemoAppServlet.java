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

import javax.servlet.ServletException;

import org.jsoup.nodes.Element;

import com.vaadin.server.BootstrapFragmentResponse;
import com.vaadin.server.BootstrapListener;
import com.vaadin.server.BootstrapPageResponse;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;
import com.vaadin.server.VaadinServlet;

@SuppressWarnings("serial")
public class InvientChartsDemoAppServlet extends VaadinServlet implements BootstrapListener {

    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        getService().addSessionInitListener(new SessionInitListener() {
            @Override
            public void sessionInit(SessionInitEvent event) {
                event.getSession().addBootstrapListener(InvientChartsDemoAppServlet.this);
            }
        });
    }
    
	@Override
	public void modifyBootstrapPage(BootstrapPageResponse response) {
	  Element page = response.getDocument().head();
      page.append("<script language='javascript' src='" + response.getRequest().getContextPath() + "/VAADIN/js/jquery/jquery-1.4.4.min.js'><\\/script>\n");
      page.append("<script language='javascript' src='" + response.getRequest().getContextPath() + "/VAADIN/js/highcharts/highcharts.js'><\\/script>\n");
      page.append("<script language='javascript' src='" + response.getRequest().getContextPath() + "/VAADIN/js/highcharts/modules/exporting.js'><\\/script>\n");
    }
	
    @Override
	public void modifyBootstrapFragment(BootstrapFragmentResponse response) {
	  // nothing to do
	}
}
