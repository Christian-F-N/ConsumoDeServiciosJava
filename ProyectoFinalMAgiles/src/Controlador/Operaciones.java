package Controlador;

import Interfaz.Inicio;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;

public class Operaciones {

    public void cargarActivos() {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        DefaultTableModel modelo = new DefaultTableModel();
                        modelo.addColumn("Cedula");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellido");
                        modelo.addColumn("Cant. Activos");
                        Inicio.jtFunActivos.setModel(modelo);

                        for (int i = 0; i < resp.length(); i++) {
                            Object[] obj = new Object[4];
                            obj[0] = resp.getJSONObject("" + i + "").get("ced_usu").toString();
                            obj[1] = resp.getJSONObject("" + i + "").get("nom_usu").toString();
                            obj[2] = resp.getJSONObject("" + i + "").get("ape_usu").toString();
                            obj[3] = resp.getJSONObject("" + i + "").get("count(a.id_act)").toString();
                            modelo.addRow(obj);
                        }

                    } catch (JSONException e) {
                    }
                } else {
                    System.out.println("fallo");
                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/cant_activos.php");
    }

    public void activarpanel(int a) {
        switch (a) {
            case 1:
                Inicio.jpFunActivos.setVisible(false);
                Inicio.jpIngreso.setVisible(true);
                Inicio.jpActivos.setVisible(false);
                Inicio.jtPass.setText("");
                Inicio.jtUser.setText("");

                break;
            case 2:
                Inicio.jpFunActivos.setVisible(true);
                Inicio.jpIngreso.setVisible(false);
                Inicio.jpActivos.setVisible(false);

                break;
            case 3:
                Inicio.jtNombre.setEnabled(true);
                Inicio.jpFunActivos.setVisible(false);
                Inicio.jpIngreso.setVisible(false);
                Inicio.jpActivos.setVisible(true);

                break;
            case 4:
                Inicio.jpFunActivos.setVisible(false);
                Inicio.jpIngreso.setVisible(false);
                Inicio.jpActivos.setVisible(false);

                break;
            default:
                break;

        }
    }

    public void cargarXusuario(String usuario) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        DefaultTableModel modelo = new DefaultTableModel();
                        modelo.addColumn("Id");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Estado");
                        modelo.addColumn("Cod. Barras");
                        modelo.addColumn("Descripción");
                        modelo.addColumn("Ced. Usuario");
                        Inicio.jTActivosusuario.setModel(modelo);

                        for (int i = 0;; i++) {
                            Object[] obj = new Object[6];
                            obj[0] = resp.getJSONObject("" + i + "").get("id_act").toString();
                            obj[1] = resp.getJSONObject("" + i + "").get("nom_act").toString();
                            obj[2] = resp.getJSONObject("" + i + "").get("est_act").toString();
                            obj[3] = resp.getJSONObject("" + i + "").get("cod_bar_act").toString();
                            obj[4] = resp.getJSONObject("" + i + "").get("des_act").toString();
                            obj[5] = resp.getJSONObject("" + i + "").get("ced_usu_per").toString();

                            modelo.addRow(obj);
                        }

                    } catch (JSONException e) {
                    }
                } else {

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/actXusuaruio.php?ced_usu_per=" + usuario);

    }

    public void cargarXactivo(String[] activo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        modelo.addColumn("Cod. Barras");
        modelo.addColumn("Descripción");
        modelo.addColumn("Ced. Usuario");
        Inicio.jtValidar.setModel(modelo);
        for (int i = 0; i < activo.length; i++) {
            String buscar = activo[i];
            HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    if (status.isSuccess()) {
                        try {
                            JSONObject resp = new JSONObject(status.getResult());
                            for (int i = 0;; i++) {
                                Object[] obj = new Object[6];
                                obj[0] = resp.getJSONObject("" + i + "").get("id_act").toString();
                                obj[1] = resp.getJSONObject("" + i + "").get("nom_act").toString();
                                obj[2] = resp.getJSONObject("" + i + "").get("est_act").toString();
                                obj[3] = resp.getJSONObject("" + i + "").get("cod_bar_act").toString();
                                obj[4] = resp.getJSONObject("" + i + "").get("des_act").toString();
                                obj[5] = resp.getJSONObject("" + i + "").get("ced_usu_per").toString();

                                modelo.addRow(obj);
                            }

                        } catch (JSONException e) {
                        }
                    } else {
                        System.out.println("fallo");
                    }

                }
            });

            cliente2.excecute("http://20.83.40.78/ma/views/buscarXactivo.php?id_act=" + buscar);
        }

    }

    public void cargarValidaciones() {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        DefaultTableModel modelo = new DefaultTableModel();
                        modelo.addColumn("ID proceso");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Fecha");
                        modelo.addColumn("Estado");
                        modelo.addColumn("ID responsable");
                        Inicio.jtValidacion.setModel(modelo);

                        for (int i = 0; i < resp.length(); i++) {
                            Object[] obj = new Object[5];
                            obj[0] = resp.getJSONObject("" + i + "").get("id_pro").toString();
                            obj[1] = resp.getJSONObject("" + i + "").get("nom_pro").toString();
                            obj[2] = resp.getJSONObject("" + i + "").get("fec_hor_pro").toString();
                            obj[3] = resp.getJSONObject("" + i + "").get("est_pro").toString();
                            obj[4] = resp.getJSONObject("" + i + "").get("id_res_pro").toString();
                            modelo.addRow(obj);
                        }

                    } catch (JSONException e) {
                    }
                } else {
                    System.out.println("fallo");
                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/validacion.php");
    }

    public void login(String user, String pass) {

        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {

            @Override
            public void onComplete(Response status) {
                String ingreso = "";
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        int num = resp.length();
                        if (num == 0) {
                            Inicio.Jlmensaje.setText("Credenciales incorrectas");
                        } else {
                            Inicio.Jlmensaje.setText(ingreso = "Bienvenido");
                            for (int i = 0; i < resp.length(); i++) {

                                Object[] obj = new Object[4];
                                obj[1] = resp.getJSONObject("" + i + "").get("ced_usu").toString();
                                obj[2] = resp.getJSONObject("" + i + "").get("nom_cue").toString();
                                obj[3] = resp.getJSONObject("" + i + "").get("cla_cue").toString();

                            }
                        }
                    } catch (JSONException e) {
                    }
                }
            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/login.php?ced_usu=" + user + "&cla_cue=" + pass);

    }

    public void guardarproceso(String id, String nomb, String responsable) {
        String fec = fecha();
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    JOptionPane.showMessageDialog(null, "Guardado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar");
                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/guargarValidacion.php?id_pro=" + id + "&nom_pro=" + nomb + "&id_res_pro=" + responsable + "&fec_hor_pro=" + fec);
    }

    public void guardaractivos(String idActivo, String IDvalidacion) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/guardaractPro.php?id_act_per=" + idActivo + "&id_val_per=" + IDvalidacion);
    }

    public void bloquear(String cuenta) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/bloquear.php?ced_usu=" + cuenta);
    }

    public void desbloquear(String cuenta) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {

                if (status.isSuccess()) {

                    JOptionPane.showMessageDialog(null, "Cuenta desbloqueada");

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/desbloquear.php?ced_usu=" + cuenta);
    }

    public void estadoCuenta(String user) {

        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    JSONObject resp = new JSONObject(status.getResult());
                    int num = resp.length();
                    if (num != 0) {
                        Inicio.jLEstadoCuenat.setText("A");
                    } else {
                        Inicio.jLEstadoCuenat.setText("B");
                    }

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/estadoCuenta.php?ced_usu=" + user);

    }

    public void ConsultarProceso(String proceso) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()) {
                    JSONObject resp = new JSONObject(status.getResult());
                    int num = resp.length();
                    if (num != 0) {
                        Inicio.jLStadVal.setText("si");
                    } else {
                        Inicio.jLStadVal.setText("no");
                    }

                }

            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/conValid.php?id_pro=" + proceso);
    }

    public void login2(String user, String pass) {

        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {

            @Override
            public void onComplete(Response status) {
                String ingreso = "";
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        int num = resp.length();
                        if (num == 0) {
                            Inicio.Jlmensaje.setText("Credenciales incorrectas");
                        } else {
                            Inicio.Jlmensaje.setText(ingreso = "Bienvenido");
                            for (int i = 0; i < resp.length(); i++) {

                                Object[] obj = new Object[4];
                                obj[1] = resp.getJSONObject("" + i + "").get("ced_usu").toString();
                                obj[2] = resp.getJSONObject("" + i + "").get("nom_cue").toString();
                                obj[3] = resp.getJSONObject("" + i + "").get("cla_cue").toString();

                            }
                        }
                    } catch (JSONException e) {
                    }
                }
            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/log2.php?ced_usu=" + user + "&cla_cue=" + pass);

    }

    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        String fec = formato.format(fecha);
        return fec;
    }

    public void verificarAdmin(String user, String clave) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {

            @Override
            public void onComplete(Response status) {
                String ingreso = "";
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        int num = resp.length();
                        if (num == 0) {
                            Inicio.jlAdmin.setText("no");
                            JOptionPane.showMessageDialog(null, "Usted no esta registrado como administrador");
                        } else {
                            Object[] obj = new Object[1];
                            obj[0] = resp.getJSONObject("" + 0 + "").get("nom_usu").toString();
                            Inicio.jlAdmin.setText("ok");

                            JOptionPane.showMessageDialog(null, "Bienvenido " + obj[0]);
                        }
                    } catch (JSONException e) {

                    }
                }
            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/buscAdmin.php?ced_usu=" + user + "&cla_cue=" + clave);
    }

    public void asigRol(String user, String rol) {
        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {

            @Override
            public void onComplete(Response status) {
               
                if (status.isSuccess()) {
//                    JSONObject resp = new JSONObject(status.getResult());
//                    int num = resp.length();
//                    if (num == 0) {
                        JOptionPane.showMessageDialog(null, "Asignación terminada.");
                        Inicio.jlAdmin.setText("asignar");
//                    }

                } else {
                    Inicio.jlAdmin.setText("no");
                }
            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/cambiarRol.php?ced_usu=" + user + "&rol_usu=" + rol);
    }
    
     public void usu(String user) {

        HttpClient cliente2 = new HttpClient(new OnHttpRequestComplete() {

            @Override
            public void onComplete(Response status) {
                String ingreso = "";
                if (status.isSuccess()) {
                    try {
                        JSONObject resp = new JSONObject(status.getResult());
                        int num = resp.length();
                        if (num == 0) {
                            Inicio.Jlmensaje.setText("Credenciales incorrectas");
                            Inicio.val.setText("no");
                        } else {
                            
                            Inicio.val.setText("si");
                        }
                    } catch (JSONException e) {
                    }
                }
            }
        });
        cliente2.excecute("http://20.83.40.78/ma/views/usuario.php?ced_usu="+user);

    }
} 

