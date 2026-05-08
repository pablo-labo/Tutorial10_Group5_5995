package defpackage;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnv4;", "T", "", "<init>", "()V", "", "createQuery", "()Ljava/lang/String;", "Liid;", "statement", "entity", "Lj6g;", "bind", "(Liid;Ljava/lang/Object;)V", "Lzhd;", "connection", "", "handle", "(Lzhd;Ljava/lang/Object;)I", "", "entities", "handleMultiple", "(Lzhd;Ljava/lang/Iterable;)I", "", "(Lzhd;[Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class nv4<T> {
    public abstract void bind(iid statement, T entity);

    public abstract String createQuery();

    public final int handle(zhd connection, T entity) {
        connection.getClass();
        if (entity == null) {
            return 0;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            bind(iidVarQ1, entity);
            iidVarQ1.M1();
            pi3.d(iidVarQ1, null);
            return wea.g(connection);
        } finally {
        }
    }

    public final int handleMultiple(zhd connection, T[] entities) {
        connection.getClass();
        int iG = 0;
        if (entities == null) {
            return 0;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        int i = 0;
        while (i < entities.length) {
            try {
                int i2 = i + 1;
                try {
                    T t = entities[i];
                    if (t != null) {
                        bind(iidVarQ1, t);
                        iidVarQ1.M1();
                        iidVarQ1.reset();
                        iG += wea.g(connection);
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } finally {
            }
        }
        j6g j6gVar = j6g.a;
        pi3.d(iidVarQ1, null);
        return iG;
    }

    public final int handleMultiple(zhd connection, Iterable<? extends T> entities) {
        connection.getClass();
        int iG = 0;
        if (entities == null) {
            return 0;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            for (T t : entities) {
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    iG += wea.g(connection);
                }
            }
            j6g j6gVar = j6g.a;
            pi3.d(iidVarQ1, null);
            return iG;
        } finally {
        }
    }
}
