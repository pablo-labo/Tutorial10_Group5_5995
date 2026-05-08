package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ua9 implements SuccessContinuation {
    public Object a;
    public Object b;

    public static ua9 b(InputStream inputStream) throws IOException {
        String str;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte b = dataInputStream.readByte();
        if (b == 1) {
            str = "arm64-v8a";
        } else if (b == 2) {
            str = "armeabi-v7a";
        } else if (b == 3) {
            str = "x86_64";
        } else {
            if (b != 4) {
                b0.o(p6.c(b, "Unrecognized arch id: "));
                return null;
            }
            str = "x86";
        }
        int i = dataInputStream.readShort() & 65535;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = new byte[dataInputStream.readShort() & 65535];
            dataInputStream.readFully(bArr);
            arrayList.add(new String(bArr, StandardCharsets.UTF_8));
        }
        ua9 ua9Var = new ua9();
        ua9Var.b = str;
        ua9Var.a = Collections.unmodifiableList(arrayList);
        return ua9Var;
    }

    public ey9 a(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        qnc qncVar = new qnc();
        List<kya> list = (List) this.a;
        for (kya kyaVar : list) {
            arrayList.addAll(kyaVar.e(reactApplicationContext));
            if (kyaVar instanceof inc) {
                qncVar.a.add((inc) kyaVar);
            }
        }
        arrayList.add(qncVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kya) it.next()).b();
            arrayList2.addAll(Collections.EMPTY_LIST);
        }
        return new ey9(arrayList, arrayList2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        jvh jvhVar = (jvh) this.b;
        tvh tvhVar = (tvh) this.a;
        synchronized (jvhVar) {
            jvhVar.c = Tasks.forResult(tvhVar);
        }
        return Tasks.forResult(tvhVar);
    }
}
