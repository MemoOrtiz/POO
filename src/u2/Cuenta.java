package u2;

public class Cuenta {
	private String clave;
	private float saldo;
	
	public Cuenta(String clave, float saldo) {
		this.clave = clave;
		this.saldo = saldo;
	}

	public Cuenta(String clave) {
		this.clave = clave;
	}

	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(float monto) {
		if(monto>0) {
		saldo = saldo + monto;
		}
	}
	public void retirar(float monto) {
		if(monto<=saldo) {
		saldo = saldo-monto;
		}
	}

	public String toString() {
		return "Cuenta [clave=" + clave + ", saldo=" + saldo + "]";
	}
	
	

}
