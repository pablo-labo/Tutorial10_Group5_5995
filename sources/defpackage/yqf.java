package defpackage;

import defpackage.l9c;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class yqf {
    public boolean f;
    public final long a = Thread.currentThread().getId();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public boolean g = true;

    public abstract l9c.b a(boolean z);

    public final void b() {
        if (this.a == Thread.currentThread().getId()) {
            a(this.f && this.g);
        } else {
            r6.g("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
        }
    }

    public abstract yqf c();
}
