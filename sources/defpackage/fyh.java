package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class fyh extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ DateFormat initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }
}
