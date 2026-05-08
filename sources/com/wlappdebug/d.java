package com.wlappdebug;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.wlappdebug.DebugActivity;
import defpackage.mj8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends mj8 implements Function1<Context, View> {
    final /* synthetic */ List<DebugActivity.a> $actions;
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<DebugActivity.a> list, DebugActivity debugActivity) {
        super(1);
        this.$actions = list;
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context context2 = context;
        context2.getClass();
        LinearLayout linearLayout = new LinearLayout(context2);
        List<DebugActivity.a> list = this.$actions;
        DebugActivity debugActivity = this.this$0;
        linearLayout.setOrientation(1);
        for (DebugActivity.a aVar : list) {
            aVar.getClass();
            final c cVar = new c(aVar, debugActivity);
            Button button = new Button(context2);
            button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            button.setText((CharSequence) null);
            button.setAllCaps(false);
            button.setOnClickListener(new View.OnClickListener() { // from class: eh3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cVar.invoke(view);
                    throw null;
                }
            });
            linearLayout.addView(button);
        }
        return linearLayout;
    }
}
