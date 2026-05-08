package com.datadog.android.rum.internal.instrumentation.gestures;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u0019\u0010 \u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u0019\u0010$\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010%J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u0016J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0003J)\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010:\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b:\u0010>J\u0019\u0010?\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b?\u0010\b¨\u0006@"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/NoOpWindowCallback;", "Landroid/view/Window$Callback;", "<init>", "()V", "Landroid/view/ActionMode;", "mode", "Lj6g;", "onActionModeFinished", "(Landroid/view/ActionMode;)V", "", "featureId", "Landroid/view/View;", "onCreatePanelView", "(I)Landroid/view/View;", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/Menu;", "menu", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/ActionMode$Callback;", "callback", "onWindowStartingActionMode", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "type", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "onAttachedToWindow", "dispatchGenericMotionEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTrackballEvent", "Landroid/view/KeyEvent;", "dispatchKeyShortcutEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onMenuOpened", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onDetachedFromWindow", "view", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "Landroid/view/WindowManager$LayoutParams;", "attrs", "onWindowAttributesChanged", "(Landroid/view/WindowManager$LayoutParams;)V", "hasFocus", "onWindowFocusChanged", "(Z)V", "onContentChanged", "onSearchRequested", "()Z", "Landroid/view/SearchEvent;", "searchEvent", "(Landroid/view/SearchEvent;)Z", "onActionModeStarted", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpWindowCallback implements Window.Callback {
    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode mode) {
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        menu.getClass();
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int featureId) {
        return null;
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        item.getClass();
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int featureId, Menu menu) {
        menu.getClass();
        return false;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        menu.getClass();
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        menu.getClass();
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return null;
    }
}
