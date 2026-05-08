package okhttp3.internal.ws;

import com.datadog.android.okhttp.DatadogInterceptor;
import defpackage.h5;
import defpackage.j6g;
import defpackage.ja;
import defpackage.l5;
import defpackage.l6;
import defpackage.r40;
import defpackage.ro1;
import defpackage.to1;
import defpackage.u63;
import defpackage.vr1;
import defpackage.w20;
import defpackage.w40;
import defpackage.wl7;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection$newWebSocketStreams$1;
import okhttp3.internal.ws.WebSocketReader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final List<Protocol> w;
    public final WebSocketListener a;
    public final Random b;
    public final long c;
    public WebSocketExtensions d;
    public final long e;
    public final String f;
    public RealCall g;
    public Task h;
    public WebSocketReader i;
    public WebSocketWriter j;
    public final TaskQueue k;
    public String l;
    public RealConnection$newWebSocketStreams$1 m;
    public final ArrayDeque<vr1> n;
    public final ArrayDeque<Object> o;
    public long p;
    public boolean q;
    public int r;
    public String s;
    public boolean t;
    public int u;
    public boolean v;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {
        public final int a;
        public final vr1 b;

        public Close(vr1 vr1Var, int i) {
            this.a = i;
            this.b = vr1Var;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {
        public final int a;
        public final vr1 b;

        public Message(vr1 vr1Var, int i) {
            vr1Var.getClass();
            this.a = i;
            this.b = vr1Var;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements Closeable {
        public final to1 a;
        public final ro1 b;

        public Streams(to1 to1Var, ro1 ro1Var) {
            to1Var.getClass();
            ro1Var.getClass();
            this.a = to1Var;
            this.b = ro1Var;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class WriterTask extends Task {
        public WriterTask() {
            super(l6.i(new StringBuilder(), RealWebSocket.this.l, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.n() ? 0L : -1L;
            } catch (IOException e) {
                realWebSocket.i(e, null);
                return -1L;
            }
        }
    }

    static {
        new Companion(0);
        w = u63.Z(Protocol.HTTP_1_1);
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, long j2) {
        taskRunner.getClass();
        this.a = webSocketListener;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.k = taskRunner.e();
        this.n = new ArrayDeque<>();
        this.o = new ArrayDeque<>();
        this.r = -1;
        String str = request.b;
        if (!"GET".equals(str)) {
            h5.k(l5.l("Request must be GET: ", str));
            throw null;
        }
        vr1 vr1Var = vr1.c;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        j6g j6gVar = j6g.a;
        this.f = vr1.a.d(bArr).a();
    }

    @Override // okhttp3.WebSocket
    public final boolean a(vr1 vr1Var) {
        vr1Var.getClass();
        return m(vr1Var, 2);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void b(String str) {
        this.a.d(str, this);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void c(vr1 vr1Var) {
        vr1Var.getClass();
        this.a.e(this, vr1Var);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void d(vr1 vr1Var) {
        try {
            vr1Var.getClass();
            if (!this.t && (!this.q || !this.o.isEmpty())) {
                this.n.add(vr1Var);
                l();
            }
        } finally {
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean e(int i, String str) {
        vr1 vr1VarC;
        synchronized (this) {
            try {
                WebSocketProtocol.a.getClass();
                String strA = WebSocketProtocol.a(i);
                if (strA != null) {
                    throw new IllegalArgumentException(strA.toString());
                }
                if (str != null) {
                    vr1 vr1Var = vr1.c;
                    vr1VarC = vr1.a.c(str);
                    if (vr1VarC.h() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    vr1VarC = null;
                }
                if (!this.t && !this.q) {
                    this.q = true;
                    this.o.add(new Close(vr1VarC, i));
                    l();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void f(vr1 vr1Var) {
        vr1Var.getClass();
        this.v = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void g(int i, String str) {
        RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        if (i == -1) {
            l5.q("Failed requirement.");
            return;
        }
        synchronized (this) {
            try {
                if (this.r != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.r = i;
                this.s = str;
                realConnection$newWebSocketStreams$1 = null;
                if (this.q && this.o.isEmpty()) {
                    RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$12 = this.m;
                    this.m = null;
                    webSocketReader = this.i;
                    this.i = null;
                    webSocketWriter = this.j;
                    this.j = null;
                    this.k.f();
                    realConnection$newWebSocketStreams$1 = realConnection$newWebSocketStreams$12;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.a.b(this, i, str);
            if (realConnection$newWebSocketStreams$1 != null) {
                this.a.a(this, i, str);
            }
        } finally {
            if (realConnection$newWebSocketStreams$1 != null) {
                Util.c(realConnection$newWebSocketStreams$1);
            }
            if (webSocketReader != null) {
                Util.c(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.c(webSocketWriter);
            }
        }
    }

    public final void h(Response response, Exchange exchange) throws ProtocolException {
        Headers headers = response.f;
        int i = response.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(w40.f(sb, response.c, '\''));
        }
        String strA = headers.a("Connection");
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException(ja.f('\'', "Expected 'Connection' header value 'Upgrade' but was '", strA));
        }
        String strA2 = headers.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException(ja.f('\'', "Expected 'Upgrade' header value 'websocket' but was '", strA2));
        }
        String strA3 = headers.a(DatadogInterceptor.WEBSOCKET_ACCEPT_HEADER);
        String str = strA3 != null ? strA3 : null;
        vr1 vr1Var = vr1.c;
        String strA4 = vr1.a.c(this.f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").e("SHA-1").a();
        if (wl7.b(strA4, str)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + str + '\'');
    }

    public final void i(Exception exc, Response response) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1 = this.m;
            this.m = null;
            WebSocketReader webSocketReader = this.i;
            this.i = null;
            WebSocketWriter webSocketWriter = this.j;
            this.j = null;
            this.k.f();
            j6g j6gVar = j6g.a;
            try {
                this.a.c(this, exc);
            } finally {
                if (realConnection$newWebSocketStreams$1 != null) {
                    Util.c(realConnection$newWebSocketStreams$1);
                }
                if (webSocketReader != null) {
                    Util.c(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.c(webSocketWriter);
                }
            }
        }
    }

    public final void j(String str, RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1) {
        WebSocketExtensions webSocketExtensions = this.d;
        webSocketExtensions.getClass();
        synchronized (this) {
            try {
                this.l = str;
                this.m = realConnection$newWebSocketStreams$1;
                this.j = new WebSocketWriter(realConnection$newWebSocketStreams$1.b, this.b, webSocketExtensions.a, webSocketExtensions.c, this.e);
                this.h = new WriterTask();
                long j = this.c;
                if (j != 0) {
                    final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    TaskQueue taskQueue = this.k;
                    final String strConcat = str.concat(" ping");
                    taskQueue.c(new Task(strConcat) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                        @Override // okhttp3.internal.concurrent.Task
                        public final long a() {
                            WebSocketWriter webSocketWriter;
                            RealWebSocket realWebSocket = this;
                            synchronized (realWebSocket) {
                                try {
                                    if (!realWebSocket.t && (webSocketWriter = realWebSocket.j) != null) {
                                        int i = realWebSocket.v ? realWebSocket.u : -1;
                                        realWebSocket.u++;
                                        realWebSocket.v = true;
                                        j6g j6gVar = j6g.a;
                                        if (i != -1) {
                                            StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                            sb.append(realWebSocket.c);
                                            sb.append("ms (after ");
                                            realWebSocket.i(new SocketTimeoutException(w20.k(sb, i - 1, " successful ping/pongs)")), null);
                                        } else {
                                            try {
                                                vr1 vr1Var = vr1.c;
                                                vr1Var.getClass();
                                                webSocketWriter.a(vr1Var, 9);
                                            } catch (IOException e) {
                                                realWebSocket.i(e, null);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return nanos;
                        }
                    }, nanos);
                }
                if (!this.o.isEmpty()) {
                    l();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new WebSocketReader(realConnection$newWebSocketStreams$1.a, this, webSocketExtensions.a, webSocketExtensions.e);
    }

    public final void k() throws IOException {
        while (this.r == -1) {
            WebSocketReader webSocketReader = this.i;
            webSocketReader.getClass();
            webSocketReader.h();
            if (!webSocketReader.X) {
                zn1 zn1Var = webSocketReader.a0;
                int i = webSocketReader.f;
                if (i != 1 && i != 2) {
                    byte[] bArr = Util.a;
                    String hexString = Integer.toHexString(i);
                    hexString.getClass();
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!webSocketReader.e) {
                    long j = webSocketReader.V;
                    if (j > 0) {
                        webSocketReader.a.C0(zn1Var, j);
                    }
                    if (webSocketReader.W) {
                        if (webSocketReader.Y) {
                            MessageInflater messageInflater = webSocketReader.b0;
                            if (messageInflater == null) {
                                messageInflater = new MessageInflater(webSocketReader.d);
                                webSocketReader.b0 = messageInflater;
                            }
                            Inflater inflater = messageInflater.c;
                            zn1Var.getClass();
                            zn1 zn1Var2 = messageInflater.b;
                            if (zn1Var2.b != 0) {
                                l5.q("Failed requirement.");
                                return;
                            }
                            if (messageInflater.a) {
                                inflater.reset();
                            }
                            zn1Var2.a1(zn1Var);
                            zn1Var2.L0(65535);
                            long bytesRead = inflater.getBytesRead() + zn1Var2.b;
                            do {
                                messageInflater.d.a(zn1Var, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        WebSocketReader.FrameCallback frameCallback = webSocketReader.b;
                        if (i == 1) {
                            frameCallback.b(zn1Var.z1());
                        } else {
                            frameCallback.c(zn1Var.J0(zn1Var.b));
                        }
                    } else {
                        while (!webSocketReader.e) {
                            webSocketReader.h();
                            if (!webSocketReader.X) {
                                break;
                            } else {
                                webSocketReader.a();
                            }
                        }
                        if (webSocketReader.f != 0) {
                            int i2 = webSocketReader.f;
                            byte[] bArr2 = Util.a;
                            String hexString2 = Integer.toHexString(i2);
                            hexString2.getClass();
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                r40.h("closed");
                return;
            }
            webSocketReader.a();
        }
    }

    public final void l() {
        byte[] bArr = Util.a;
        Task task = this.h;
        if (task != null) {
            this.k.c(task, 0L);
        }
    }

    public final synchronized boolean m(vr1 vr1Var, int i) {
        if (!this.t && !this.q) {
            if (this.p + ((long) vr1Var.h()) > 16777216) {
                e(1001, null);
                return false;
            }
            this.p += (long) vr1Var.h();
            this.o.add(new Message(vr1Var, i));
            l();
            return true;
        }
        return false;
    }

    public final boolean n() {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i;
        RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1;
        synchronized (this) {
            try {
                if (this.t) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.j;
                vr1 vr1VarPoll = this.n.poll();
                Object obj = null;
                if (vr1VarPoll == null) {
                    Object objPoll = this.o.poll();
                    if (objPoll instanceof Close) {
                        i = this.r;
                        str = this.s;
                        if (i != -1) {
                            realConnection$newWebSocketStreams$1 = this.m;
                            this.m = null;
                            webSocketReader = this.i;
                            this.i = null;
                            webSocketWriter = this.j;
                            this.j = null;
                            this.k.f();
                        } else {
                            TaskQueue taskQueue = this.k;
                            final String str2 = this.l + " cancel";
                            taskQueue.c(new Task(str2) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public final long a() {
                                    RealCall realCall = this.g;
                                    realCall.getClass();
                                    realCall.cancel();
                                    return -1L;
                                }
                            }, 60000000000L);
                            realConnection$newWebSocketStreams$1 = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i = -1;
                        realConnection$newWebSocketStreams$1 = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i = -1;
                    realConnection$newWebSocketStreams$1 = null;
                }
                j6g j6gVar = j6g.a;
                try {
                    if (vr1VarPoll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.a(vr1VarPoll, 10);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        webSocketWriter2.getClass();
                        webSocketWriter2.h(message.b, message.a);
                        synchronized (this) {
                            this.p -= (long) message.b.h();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        webSocketWriter2.getClass();
                        int i2 = close.a;
                        vr1 vr1Var = close.b;
                        vr1 vr1VarJ0 = vr1.c;
                        if (i2 != 0 || vr1Var != null) {
                            if (i2 != 0) {
                                WebSocketProtocol.a.getClass();
                                String strA = WebSocketProtocol.a(i2);
                                if (strA != null) {
                                    throw new IllegalArgumentException(strA.toString());
                                }
                            }
                            zn1 zn1Var = new zn1();
                            zn1Var.N0(i2);
                            if (vr1Var != null) {
                                zn1Var.o0(vr1Var);
                            }
                            vr1VarJ0 = zn1Var.J0(zn1Var.b);
                        }
                        try {
                            webSocketWriter2.a(vr1VarJ0, 8);
                            if (realConnection$newWebSocketStreams$1 != null) {
                                WebSocketListener webSocketListener = this.a;
                                str.getClass();
                                webSocketListener.a(this, i, str);
                            }
                        } finally {
                            webSocketWriter2.W = true;
                        }
                    }
                    return true;
                } finally {
                    if (realConnection$newWebSocketStreams$1 != null) {
                        Util.c(realConnection$newWebSocketStreams$1);
                    }
                    if (webSocketReader != null) {
                        Util.c(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.c(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String str) {
        vr1 vr1Var = vr1.c;
        return m(vr1.a.c(str), 1);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
