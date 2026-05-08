package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j25 implements l25 {
    @Override // defpackage.l25
    public final boolean a(String str) {
        if (str != null) {
            return str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif");
        }
        return false;
    }
}
