package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n15 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;

    public /* synthetic */ n15(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final void a(Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "No message provided.";
        }
        boolean z = this.a;
        String str = this.b;
        if (z) {
            c49.d(str, localizedMessage, th);
        } else {
            c49.b(str, localizedMessage, th);
        }
    }
}
