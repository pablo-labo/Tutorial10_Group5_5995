package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertController;
import com.indeed.android.jobsearch.R;
import defpackage.o98;

/* JADX INFO: loaded from: classes2.dex */
public final class o98 {
    public final Activity a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final a g;

    public static final class a {
        public final JsResult a;
        public boolean b;

        public a(JsResult jsResult) {
            jsResult.getClass();
            this.a = jsResult;
        }

        public final void a() {
            this.a.confirm();
            this.b = true;
        }
    }

    public o98(Activity activity, JsResult jsResult, Integer num, String str, String str2, String str3, int i) {
        Integer numValueOf = (i & 4) != 0 ? null : Integer.valueOf(R.string.js_dialog_before_unload_positive_button);
        num = (i & 8) != 0 ? null : num;
        str = (i & 16) != 0 ? null : str;
        activity.getClass();
        jsResult.getClass();
        this.a = activity;
        this.b = numValueOf;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = new a(jsResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [m98] */
    public final void a() {
        Activity activity = this.a;
        if (activity.isFinishing()) {
            return;
        }
        le9 le9Var = new le9(activity, 0);
        String str = this.f;
        if (str != null) {
            le9Var.f(str);
        }
        AlertController.b bVar = le9Var.a;
        String str2 = this.e;
        if (str2 != null) {
            bVar.f = str2;
        }
        Integer num = this.c;
        if (num != null) {
            le9Var.c(num.intValue(), new k87(this, 1));
        }
        final EditText editText = null;
        String str3 = this.d;
        if (str3 != null) {
            View viewInflate = activity.getLayoutInflater().inflate(R.layout.js_prompt, (ViewGroup) null, false);
            EditText editText2 = (EditText) esg.a(viewInflate, R.id.value);
            if (editText2 == null) {
                ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.value)));
                return;
            } else {
                le9Var.g((LinearLayout) viewInflate);
                editText2.setText(str3);
                editText = editText2;
            }
        }
        Integer num2 = this.b;
        String string = activity.getString(num2 != null ? num2.intValue() : android.R.string.ok);
        string.getClass();
        le9Var.e(string, new DialogInterface.OnClickListener() { // from class: m98
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                o98.a aVar = this.g;
                EditText editText3 = editText;
                if (editText3 != null) {
                    String string2 = editText3.getText().toString();
                    JsResult jsResult = aVar.a;
                    if (jsResult instanceof JsPromptResult) {
                        ((JsPromptResult) jsResult).confirm(string2);
                        aVar.b = true;
                    } else {
                        aVar.a();
                    }
                } else {
                    aVar.a();
                }
                dialogInterface.dismiss();
            }
        });
        bVar.n = new DialogInterface.OnDismissListener() { // from class: n98
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o98.a aVar = this.a.g;
                if (aVar.b) {
                    return;
                }
                aVar.a.cancel();
            }
        };
        le9Var.b();
    }
}
