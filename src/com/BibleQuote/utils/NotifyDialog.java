/*
 * Copyright (C) 2011 Scripture Software (http://scripturesoftware.org/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.BibleQuote.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class NotifyDialog {
	private AlertDialog alertDialog;
	
	public NotifyDialog(String message, Context context) {
		alertDialog = new AlertDialog.Builder(context).create();
		alertDialog.setTitle("Oops!");
		alertDialog.setMessage(message);
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog, int which) {
		   }
		});
	}
	
	public void show() {
		alertDialog.show();
	}
}
