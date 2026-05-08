package okhttp3.internal.cache;

import defpackage.j6g;
import defpackage.mj8;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lj6g;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends mj8 implements Function1<IOException, j6g> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(IOException iOException) {
        iOException.getClass();
        DiskLruCache diskLruCache = this.this$0;
        byte[] bArr = Util.a;
        diskLruCache.Z = true;
        return j6g.a;
    }
}
