package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v6c {
    public static final v6c a;
    public static final v6c b;
    public static final v6c c;
    public static final v6c d;
    public static final /* synthetic */ v6c[] e;
    public static final /* synthetic */ wv4 f;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        v6c v6cVar = new v6c("PublicationTitle", 0, 1, R.string.title);
        a = v6cVar;
        v6c v6cVar2 = new v6c("PublicationURL", 1, 2, R.string.url_field_label);
        b = v6cVar2;
        v6c v6cVar3 = new v6c("PublicationDatePublished", 2, 3, R.string.date_published);
        c = v6cVar3;
        v6c v6cVar4 = new v6c("PublicationDescription", 3, 4, R.string.description);
        d = v6cVar4;
        v6c[] v6cVarArr = {v6cVar, v6cVar2, v6cVar3, v6cVar4};
        e = v6cVarArr;
        f = new wv4(v6cVarArr);
    }

    public v6c(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static v6c valueOf(String str) {
        return (v6c) Enum.valueOf(v6c.class, str);
    }

    public static v6c[] values() {
        return (v6c[]) e.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
