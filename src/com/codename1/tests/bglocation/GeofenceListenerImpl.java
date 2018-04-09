/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.tests.bglocation;

import com.codename1.location.GeofenceListener;

/**
 *
 * @author shannah
 */
public class GeofenceListenerImpl implements GeofenceListener {

    @Override
    public void onExit(String id) {
        System.out.println("Exited "+id);
    }

    @Override
    public void onEntered(String id) {
        System.out.println("Entered "+id);
    }
    
}
