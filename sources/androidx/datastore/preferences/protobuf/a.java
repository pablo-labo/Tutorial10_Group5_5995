package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0030a;
import defpackage.sp9;
import defpackage.uod;
import defpackage.up9;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0030a<MessageType, BuilderType>> implements sp9 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0030a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0030a<MessageType, BuilderType>> implements up9, Cloneable {
    }

    public int a() {
        throw new UnsupportedOperationException();
    }

    public final int b(uod uodVar) {
        int iA = a();
        if (iA != -1) {
            return iA;
        }
        int iD = uodVar.d(this);
        h(iD);
        return iD;
    }

    public void h(int i) {
        throw new UnsupportedOperationException();
    }
}
