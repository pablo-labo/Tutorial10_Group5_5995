package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class vjc extends ClickableSpan implements moc {
    public final int a;
    public boolean b;
    public int c;

    public vjc(int i) {
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        int i = this.a;
        EventDispatcher eventDispatcherE = dmc.e(reactContext, i);
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new qg6(dmc.g(reactContext), i, 1));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        if (this.b) {
            textPaint.bgColor = this.c;
        }
    }
}
