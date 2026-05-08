package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\u001eJ/\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J1\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010!J/\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b#\u0010$J-\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¢\u0006\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lpv4;", "T", "", "<init>", "()V", "", "createQuery", "()Ljava/lang/String;", "Liid;", "statement", "entity", "Lj6g;", "bind", "(Liid;Ljava/lang/Object;)V", "Lzhd;", "connection", "insert", "(Lzhd;Ljava/lang/Object;)V", "", "entities", "(Lzhd;[Ljava/lang/Object;)V", "", "(Lzhd;Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Lzhd;Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Lzhd;Ljava/util/Collection;)[J", "(Lzhd;[Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Lzhd;Ljava/util/Collection;)[Ljava/lang/Long;", "(Lzhd;[Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "(Lzhd;[Ljava/lang/Object;)Ljava/util/List;", "(Lzhd;Ljava/util/Collection;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class pv4<T> {
    public abstract void bind(iid statement, T entity);

    public abstract String createQuery();

    public final void insert(zhd connection, T[] entities) {
        connection.getClass();
        if (entities == null) {
            return;
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
    }

    public final long insertAndReturnId(zhd connection, T entity) {
        connection.getClass();
        if (entity == null) {
            return -1L;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            bind(iidVarQ1, entity);
            iidVarQ1.M1();
            pi3.d(iidVarQ1, null);
            return wea.f(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(zhd connection, Collection<? extends T> entities) {
        long jF;
        connection.getClass();
        if (entities == null) {
            return new long[0];
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            int size = entities.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object objL0 = z92.L0(i, entities);
                if (objL0 != null) {
                    bind(iidVarQ1, objL0);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    jF = wea.f(connection);
                } else {
                    jF = -1;
                }
                jArr[i] = jF;
            }
            pi3.d(iidVarQ1, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(zhd connection, Collection<? extends T> entities) {
        long jF;
        connection.getClass();
        if (entities == null) {
            return new Long[0];
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object objL0 = z92.L0(i, entities);
                if (objL0 != null) {
                    bind(iidVarQ1, objL0);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    jF = wea.f(connection);
                } else {
                    jF = -1;
                }
                lArr[i] = Long.valueOf(jF);
            }
            pi3.d(iidVarQ1, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(zhd connection, Collection<? extends T> entities) {
        connection.getClass();
        if (entities == null) {
            return zr4.a;
        }
        iy8 iy8VarS = u63.s();
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            for (T t : entities) {
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    iy8VarS.add(Long.valueOf(wea.f(connection)));
                } else {
                    iy8VarS.add(-1L);
                }
            }
            j6g j6gVar = j6g.a;
            pi3.d(iidVarQ1, null);
            return iy8VarS.l();
        } finally {
        }
    }

    public final void insert(zhd connection, T entity) {
        connection.getClass();
        if (entity == null) {
            return;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            bind(iidVarQ1, entity);
            iidVarQ1.M1();
            pi3.d(iidVarQ1, null);
        } finally {
        }
    }

    public final void insert(zhd connection, Iterable<? extends T> entities) {
        connection.getClass();
        if (entities == null) {
            return;
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            for (T t : entities) {
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                }
            }
            j6g j6gVar = j6g.a;
            pi3.d(iidVarQ1, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(zhd connection, T[] entities) {
        long jF;
        connection.getClass();
        if (entities == null) {
            return new long[0];
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            int length = entities.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                T t = entities[i];
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    jF = wea.f(connection);
                } else {
                    jF = -1;
                }
                jArr[i] = jF;
            }
            pi3.d(iidVarQ1, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(zhd connection, T[] entities) {
        long jF;
        connection.getClass();
        if (entities == null) {
            return new Long[0];
        }
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                T t = entities[i];
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    jF = wea.f(connection);
                } else {
                    jF = -1;
                }
                lArr[i] = Long.valueOf(jF);
            }
            pi3.d(iidVarQ1, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(zhd connection, T[] entities) {
        connection.getClass();
        if (entities == null) {
            return zr4.a;
        }
        iy8 iy8VarS = u63.s();
        iid iidVarQ1 = connection.Q1(createQuery());
        try {
            for (T t : entities) {
                if (t != null) {
                    bind(iidVarQ1, t);
                    iidVarQ1.M1();
                    iidVarQ1.reset();
                    iy8VarS.add(Long.valueOf(wea.f(connection)));
                } else {
                    iy8VarS.add(-1L);
                }
            }
            j6g j6gVar = j6g.a;
            pi3.d(iidVarQ1, null);
            return iy8VarS.l();
        } finally {
        }
    }
}
