package defpackage;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class lkc extends InputConnectionWrapper {
    public final ikc a;
    public final EventDispatcher b;
    public boolean c;
    public String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkc(rq4 rq4Var, ReactContext reactContext, ikc ikcVar, EventDispatcher eventDispatcher) {
        super(rq4Var, false);
        eventDispatcher.getClass();
        this.a = ikcVar;
        this.b = eventDispatcher;
    }

    public final void b(String str) {
        if (wl7.b(str, "\n")) {
            str = "Enter";
        }
        ikc ikcVar = this.a;
        this.b.a(new bpc(dmc.h(ikcVar), ikcVar.getId(), str));
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        charSequence.getClass();
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.length() == 0) {
                string = "Backspace";
            }
            if (this.c) {
                this.d = string;
            } else {
                b(string);
            }
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        b("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        this.c = false;
        String str = this.d;
        if (str != null) {
            b(str);
            this.d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0) {
            int unicodeChar = keyEvent.getUnicodeChar();
            boolean z = false;
            if (48 <= unicodeChar && unicodeChar < 58) {
                z = true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 66) {
                b("Enter");
            } else if (keyCode == 67) {
                b("Backspace");
            } else if (z) {
                b(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        String strValueOf;
        charSequence.getClass();
        ikc ikcVar = this.a;
        int selectionStart = ikcVar.getSelectionStart();
        int selectionEnd = ikcVar.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = ikcVar.getSelectionStart();
        boolean z = selectionStart == selectionEnd;
        boolean z2 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!z && z2)) {
            strValueOf = "Backspace";
        } else {
            Editable text = ikcVar.getText();
            strValueOf = String.valueOf(text != null ? Character.valueOf(text.charAt(selectionStart2 - 1)) : null);
        }
        if (this.c) {
            this.d = strValueOf;
            return composingText;
        }
        b(strValueOf);
        return composingText;
    }
}
