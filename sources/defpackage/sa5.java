package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.qa5;
import expo.modules.filesystem.legacy.DownloadOptionsLegacy;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.functions.Function2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.filesystem.legacy.FileSystemLegacyModule$downloadResumableTask$2", f = "FileSystemLegacyModule.kt", l = {}, m = "invokeSuspend")
public final class sa5 extends c1f implements Function2<e13, lu2, Object> {
    final /* synthetic */ qa5.a $params;
    int label;
    final /* synthetic */ qa5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa5(lu2 lu2Var, qa5.a aVar, qa5 qa5Var) {
        super(2, lu2Var);
        this.$params = aVar;
        this.this$0 = qa5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sa5(lu2Var, this.$params, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2 lu2Var) {
        ((sa5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        return null;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        qa5.a aVar = this.$params;
        DownloadOptionsLegacy downloadOptionsLegacy = aVar.a;
        RealCall realCall = aVar.b;
        File file = aVar.c;
        boolean z = aVar.d;
        p3c p3cVar = aVar.e;
        try {
            Response responseB = realCall.b();
            ResponseBody responseBody = responseB.V;
            responseBody.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(responseBody.a());
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            juc jucVar = new juc();
            while (true) {
                int i = bufferedInputStream.read(bArr);
                jucVar.element = i;
                if (i == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            Bundle bundle = new Bundle();
            qa5 qa5Var = this.this$0;
            bundle.putString("uri", Uri.fromFile(file).toString());
            bundle.putInt("status", responseB.d);
            bundle.putBundle("headers", qa5.l(qa5Var, responseB.f));
            boolean md5 = downloadOptionsLegacy.getMd5();
            Boolean boolValueOf = Boolean.valueOf(md5);
            if (!md5) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                bundle.putString("md5", qa5.j(qa5Var, file));
            }
            responseB.close();
            p3cVar.resolve(bundle);
            return null;
        } catch (Exception e) {
            if (realCall.e0) {
                p3cVar.resolve((Object) null);
                return null;
            }
            String message = e.getMessage();
            if (message != null) {
                new Integer(Log.e(ta5.a, message));
            }
            p3cVar.reject(ta5.a, e.getMessage(), e);
            return null;
        }
    }
}
