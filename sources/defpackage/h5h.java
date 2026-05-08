package defpackage;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface h5h extends Closeable {
    void incrementTraceCount();

    void start();

    void write(List<rc3> list);
}
