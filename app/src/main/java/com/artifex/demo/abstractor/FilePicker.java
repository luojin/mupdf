package com.artifex.demo.abstractor;

import android.net.Uri;

public abstract class FilePicker {
	public interface FilePickerSupport {
		void performPickFor(FilePicker picker);
	}

	private final FilePickerSupport support;

	public FilePicker(FilePickerSupport _support) {
		support = _support;
	}

	public void pick() {
		support.performPickFor(this);
	}

	public abstract void onPick(Uri uri);
}
