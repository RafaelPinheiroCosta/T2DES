package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.rafaelcosta.application.model.Despesas;

@Named("table")
@SessionScoped
public class TabelaBean implements Serializable {

	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
//	public TableBean() {
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	
//	Despesa d = new Despesa();
//	
//	try {
//		d.setData(sdf.parse("15/02/2030"));
//	} catch (ParseException e) {
//	}
//	
//	d.setDescricao("Item Qualquer");
//	d.setEdit(false);
//	d.setValor(135.0);
//	despesasList.add(d);
//	
//	d = new Despesa();
//	
//	try {
//		d.setData(sdf.parse("20/03/2030"));
//	} catch (ParseException e) {
//	}
//	
//	d.setDescricao("Item Qualquer 2");
//	d.setEdit(false);
//	d.setValor(1000.0);
//	despesasList.add(d);
//}
	
	public String inserir() {
		Despesas d = new Despesas();
		d.setEdit(true);
		despesasList.add(d);
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	public String gravar(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	public String excluir(Despesas despesa) {
		despesasList.remove(despesa);
		return null;
	}
	
	public ListDataModel<Despesas> getDespesas() {
		return despesas;
	}
}
