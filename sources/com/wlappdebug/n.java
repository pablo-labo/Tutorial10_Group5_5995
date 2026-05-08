package com.wlappdebug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.wlappdebug.DebugActivity;
import defpackage.mj8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends mj8 implements Function1<Context, View> {
    final /* synthetic */ List<DebugActivity.b<String>> $metrics;
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List<DebugActivity.b<String>> list, DebugActivity debugActivity) {
        super(1);
        this.$metrics = list;
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context context2 = context;
        context2.getClass();
        TextView textView = new TextView(context2);
        List<DebugActivity.b<String>> list = this.$metrics;
        DebugActivity debugActivity = this.this$0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (DebugActivity.b<String> bVar : list) {
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            bVar.getClass();
            spannableStringBuilder.append((CharSequence) null);
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) " = ");
            String str = (String) debugActivity.v0.get(bVar);
            if (str == null) {
                str = "(loading...)";
            }
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append('\n').getClass();
        }
        textView.setText(new SpannedString(spannableStringBuilder));
        return textView;
    }
}
