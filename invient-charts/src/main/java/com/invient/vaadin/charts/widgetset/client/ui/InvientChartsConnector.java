package com.invient.vaadin.charts.widgetset.client.ui;

import com.invient.vaadin.charts.InvientCharts;
import com.vaadin.client.ui.LegacyConnector;
import com.vaadin.client.ui.SimpleManagedLayout;
import com.vaadin.shared.ui.Connect;

@Connect(InvientCharts.class)
public class InvientChartsConnector extends LegacyConnector implements SimpleManagedLayout {

    @Override
    public VInvientCharts getWidget() {
        return (VInvientCharts) super.getWidget();
    }

	@Override
	public void layout() {
		getWidget().updateChartSize();		
	}    
}
