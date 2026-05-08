package defpackage;

import android.content.DialogInterface;
import defpackage.o98;
import defpackage.s87;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k87 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                o87 o87Var = (o87) obj;
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) o87Var.b.getValue(), tx5.k(o87Var.c, "download-listener-go-to-settings", "cancel", null, 12));
                break;
            default:
                o98.a aVar = ((o98) obj).g;
                aVar.a.cancel();
                aVar.b = true;
                dialogInterface.dismiss();
                break;
        }
    }
}
