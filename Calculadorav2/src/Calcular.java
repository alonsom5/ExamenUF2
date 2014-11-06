import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;


public class Calcular {
	private static Text resultado;

	/**
	 * Launch the application.
	 * @param args
	 */
	//Variables para los calculos
	public static String operacion;
	public static Integer primero;
	public static Integer segundo;
	public static Integer resul=0;
	
	static void calculos(String operacion, Integer primero, Integer segundo) {
		
		//Operación División
		if(operacion.equals("dividir")) {
			resul = primero / segundo;
		}
		
		//Operación Multiplicar
		if(operacion.equals("multiplicar")) {
			resul = primero * segundo;
		}
		
		//Operación suma
		if(operacion.equals("suma")) {
			resul = primero + segundo;
		}
		
		//Operación Resta
		if(operacion.equals("resta")) {
			resul = primero - segundo;
		}
		resultado.setText(resultado.getText()+resul);
}
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(232, 254);
		shell.setText("Calculadora");
		
		
		
		
		Button num0 = new Button(shell, SWT.NONE);
		num0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
				}
				else resultado.setText(resultado.getText()+num0.getText());
			}
		});
		num0.setBounds(10, 180, 41, 25);
		num0.setText("0");
		
		Button igual = new Button(shell, SWT.NONE);
		igual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				segundo = Integer.parseInt(resultado.getText());
				resultado.setText("");
				calculos(operacion,primero,segundo);
			}
		});
		igual.setText("=");
		igual.setBounds(57, 180, 88, 25);
		
		Button num1 = new Button(shell, SWT.NONE);
		num1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {	
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num1.getText());
				}
				else resultado.setText(resultado.getText()+num1.getText());
			}

		});
		num1.setText("1");
		num1.setBounds(10, 149, 41, 25);
		
		Button num2 = new Button(shell, SWT.NONE);
		num2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num2.getText());
				}
				else resultado.setText(resultado.getText()+num2.getText());
			}
		});
		num2.setText("2");
		num2.setBounds(57, 149, 41, 25);
			
		Button num3 = new Button(shell, SWT.NONE);
		num3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num3.getText());
				}
				else resultado.setText(resultado.getText()+num3.getText());
			}
		});
		num3.setText("3");
		num3.setBounds(104, 149, 41, 25);
		
		Button num6 = new Button(shell, SWT.NONE);
		num6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num6.getText());
				}
				else resultado.setText(resultado.getText()+num6.getText());
			}
		});
		num6.setText("6");
		num6.setBounds(104, 118, 41, 25);
		
		Button num5 = new Button(shell, SWT.NONE);
		num5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num5.getText());
				}
				else resultado.setText(resultado.getText()+num5.getText());		
				
			}
		});
		num5.setText("5");
		num5.setBounds(57, 118, 41, 25);
		
		Button num4 = new Button(shell, SWT.NONE);
		num4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num4.getText());
				}
				else resultado.setText(resultado.getText()+num4.getText());
				
			}
		});
		num4.setText("4");
		num4.setBounds(10, 118, 41, 25);
		
		Button num7 = new Button(shell, SWT.NONE);
		num7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num7.getText());
				}
				else resultado.setText(resultado.getText()+num7.getText());
			}
		});
		num7.setText("7");
		num7.setBounds(10, 87, 41, 25);
		
		Button num8 = new Button(shell, SWT.NONE);
		num8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num8.getText());
				}
				else resultado.setText(resultado.getText()+num8.getText());
			}
		});
		num8.setText("8");
		num8.setBounds(57, 87, 41, 25);
		
		Button num9 = new Button(shell, SWT.NONE);
		num9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (resultado.getText().equals("0")){
					resultado.setText("");
					resultado.setText(resultado.getText()+num9.getText());
				}
				else resultado.setText(resultado.getText()+num9.getText());
			}
		});
		num9.setText("9");
		num9.setBounds(104, 87, 41, 25);
		
		Button suma = new Button(shell, SWT.NONE);
		suma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				primero = Integer.parseInt(resultado.getText());
				operacion = "suma";
				resultado.setText("");
			}
		});
		suma.setBounds(161, 178, 41, 28);
		suma.setText("+");
		
		Button resta = new Button(shell, SWT.NONE);
		resta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				primero = Integer.parseInt(resultado.getText());
				operacion = "resta";
				resultado.setText("");
			}
		});
		resta.setText("-");
		resta.setBounds(161, 147, 41, 28);
		
		Button multiplicar = new Button(shell, SWT.NONE);
		multiplicar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				primero = Integer.parseInt(resultado.getText());
				operacion = "multiplicar";
				resultado.setText("");
			}
		});
		multiplicar.setText("*");
		multiplicar.setBounds(161, 116, 41, 28);
		
		Button dividir = new Button(shell, SWT.NONE);
		dividir.setText("/");
		dividir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				primero = Integer.parseInt(resultado.getText());
				operacion = "dividir";
				resultado.setText("");
			}
		});
		dividir.setBounds(161, 85, 41, 28);
		
		resultado = new Text(shell, SWT.BORDER | SWT.RIGHT);
		resultado.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		resultado.setText("0");
		resultado.setBounds(10, 10, 192, 36);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				resultado.setText("0");

			}
		});
		btnC.setBounds(10, 52, 192, 25);
		btnC.setText("C");

		shell.open();
		shell.layout();
		while (!shell.isDisposed())
			{
				if (!display.readAndDispatch())
					{
						display.sleep();
					}
			}
	}
}
