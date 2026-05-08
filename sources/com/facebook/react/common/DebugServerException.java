package com.facebook.react.common;

import defpackage.pxc;
import defpackage.ut0;
import defpackage.z92;
import defpackage.zr4;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/common/DebugServerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "originalMessage", "Ljava/lang/String;", "getOriginalMessage", "()Ljava/lang/String;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugServerException extends RuntimeException {
    private final String originalMessage;

    public static final class a {
        public static String a(String str) {
            Collection collectionQ1;
            List<String> listG = new pxc("/").g(str, 0);
            if (listG.isEmpty()) {
                collectionQ1 = zr4.a;
            } else {
                ListIterator<String> listIterator = listG.listIterator(listG.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        collectionQ1 = z92.q1(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                collectionQ1 = zr4.a;
            }
            return (String) ut0.u0((String[]) collectionQ1.toArray(new String[0]));
        }
    }

    public DebugServerException(String str, int i, int i2, String str2) {
        super(str + "\n  at " + str2 + ":" + i + ":" + i2);
        this.originalMessage = str;
    }

    public DebugServerException(String str) {
        super(str);
        this.originalMessage = str;
    }

    public DebugServerException(Exception exc, String str) {
        super(str, exc);
        this.originalMessage = str;
    }
}
