/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.tests.bglocation;

import com.codename1.location.Location;
import com.codename1.location.LocationListener;

/**
 *
 * @author shannah
 */
public class BackgroundLocationListener implements LocationListener {

    @Override
    public void locationUpdated(Location location) {
        System.out.println("location updated "+location.getLatitude()+", "+location.getLongitude());
    }

    @Override
    public void providerStateChanged(int newState) {
        
    }
    
}
