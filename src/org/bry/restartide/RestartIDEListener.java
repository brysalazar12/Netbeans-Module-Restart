/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bry.restartide;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.*;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;

/**
 *
 * @author bryan
 */
@ActionID(category = "File", id = "org.bry.restartide.restartidelistener")
@ActionRegistration(displayName = "Restart")
@ActionReference(path = "Menu/File", position = 2550, separatorAfter = 2575)
public class RestartIDEListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent ae) {
		LifecycleManager.getDefault().markForRestart();
		LifecycleManager.getDefault().exit();
	}
	
}
