package net.idea.i5.i5z;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileInputState;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;

public class I5ZReader<SUBSTANCE> extends ZipReader {
	protected String contextPath = "net.idea.i5._5.substance:net.idea.i5._4.substance";

	public I5ZReader(File zipfile) throws AmbitIOException {
		super(zipfile);
	}
	public I5ZReader(InputStream stream) throws AmbitIOException {
		super(stream);
	}
	
	@Override
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();
		if (name.endsWith(FileInputState.extensions[FileInputState.I5D_INDEX])) {
			logger.log(Level.FINE,name);
			InputStream in = new FileInputStream(files[index]);
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(contextPath);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				transform(jaxbUnmarshaller.unmarshal(in));
				return null;
			} catch (javax.xml.bind.UnmarshalException x) {
				throw x;
			} catch (Exception x) {
				throw x;
			} finally {
				if (in != null) in.close();
			}
		}
			
		throw new Exception("Unsupported format "+name); 
	}

	
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	
	public IStructureRecord transform(Object substance) {
		System.out.println(substance.getClass().getName());
		return null;
	}
	
}