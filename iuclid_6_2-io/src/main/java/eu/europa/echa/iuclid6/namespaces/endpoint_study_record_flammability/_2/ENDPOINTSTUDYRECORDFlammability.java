
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_flammability._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AttachmentListField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithMultiLineTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdministrativeData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                   &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks"/>
 *                   &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="AttachedJustification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                                       &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CrossReference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataSource">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
 *                   &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaterialsAndMethods">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Guideline">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                                       &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="GLPComplianceStatement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="OtherQualityAssurance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="TestMaterials">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResultsAndDiscussion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlammableGasesLowerAndUpperExplosionLimit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Aerosols">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TypeOfAerosolTested" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="ContentOfFlammableComponents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="TestParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlammableSolids">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="BurningTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="MoistureWt" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PyrophoricSolids">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="Temp" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value="2493"/>
 *                                                       &lt;enumeration value="3887"/>
 *                                                       &lt;enumeration value="3888"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="unitOther" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="value" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PyrophoricLiquids">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="Temp" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value="2493"/>
 *                                                       &lt;enumeration value="3887"/>
 *                                                       &lt;enumeration value="3888"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="unitOther" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="value" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SelfHeatingSubstancesMixtures">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="MaxTempReached" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                       &lt;element name="InductionTimeH" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                       &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SubstancesMixturesWhichInContactWithWaterEmitFlammableGases">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="MaxRateOfGasRelease" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value="60424"/>
 *                                                       &lt;enumeration value="60425"/>
 *                                                       &lt;enumeration value="1342"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="unitOther" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="value" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="IdentityOfEvolvedGas" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOtherInformationOnResultsInclTables">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OverallRemarksAttachments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                   &lt;element name="AttachedBackgroundMaterial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField"/>
 *                   &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicantSummaryAndConclusion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InterpretationOfResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                   &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "administrativeData",
    "dataSource",
    "materialsAndMethods",
    "resultsAndDiscussion",
    "overallRemarksAttachments",
    "applicantSummaryAndConclusion"
})
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.Flammability")
public class ENDPOINTSTUDYRECORDFlammability {

    @XmlElement(name = "AdministrativeData", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion", required = true)
    protected ENDPOINTSTUDYRECORDFlammability.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDFlammability.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDFlammability.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDFlammability.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDFlammability.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDFlammability.ApplicantSummaryAndConclusion value) {
        this.applicantSummaryAndConclusion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *         &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks"/>
     *         &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="AttachedJustification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
     *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CrossReference">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataProtection",
        "endpoint",
        "studyResultType",
        "purposeFlag",
        "robustStudy",
        "usedForClassification",
        "usedForMSDS",
        "studyPeriod",
        "reliability",
        "rationalReliability",
        "dataWaiving",
        "dataWaivingJustification",
        "justificationForTypeOfInformation",
        "attachedJustification",
        "crossReference"
    })
    public static class AdministrativeData {

        @XmlElement(name = "DataProtection", required = true)
        protected DataProtectionField dataProtection;
        @XmlElement(name = "Endpoint", required = true)
        protected PicklistFieldWithSmallTextRemarks endpoint;
        @XmlElement(name = "StudyResultType", required = true)
        protected PicklistFieldWithSmallTextRemarks studyResultType;
        @XmlElement(name = "PurposeFlag", required = true)
        protected PicklistField purposeFlag;
        @XmlElement(name = "RobustStudy", required = true, type = Boolean.class, nillable = true)
        protected Boolean robustStudy;
        @XmlElement(name = "UsedForClassification", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForClassification;
        @XmlElement(name = "UsedForMSDS", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForMSDS;
        @XmlElement(name = "StudyPeriod", required = true)
        protected String studyPeriod;
        @XmlElement(name = "Reliability", required = true)
        protected PicklistField reliability;
        @XmlElement(name = "RationalReliability", required = true)
        protected PicklistFieldWithLargeTextRemarks rationalReliability;
        @XmlElement(name = "DataWaiving", required = true)
        protected PicklistField dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<PicklistFieldWithLargeTextRemarks> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation", required = true)
        protected String justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link DataProtectionField }
         *     
         */
        public DataProtectionField getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataProtectionField }
         *     
         */
        public void setDataProtection(DataProtectionField value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setEndpoint(PicklistFieldWithSmallTextRemarks value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setStudyResultType(PicklistFieldWithSmallTextRemarks value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setPurposeFlag(PicklistField value) {
            this.purposeFlag = value;
        }

        /**
         * Gets the value of the robustStudy property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getRobustStudy() {
            return robustStudy;
        }

        /**
         * Sets the value of the robustStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRobustStudy(Boolean value) {
            this.robustStudy = value;
        }

        /**
         * Gets the value of the usedForClassification property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getUsedForClassification() {
            return usedForClassification;
        }

        /**
         * Sets the value of the usedForClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsedForClassification(Boolean value) {
            this.usedForClassification = value;
        }

        /**
         * Gets the value of the usedForMSDS property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getUsedForMSDS() {
            return usedForMSDS;
        }

        /**
         * Sets the value of the usedForMSDS property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsedForMSDS(Boolean value) {
            this.usedForMSDS = value;
        }

        /**
         * Gets the value of the studyPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudyPeriod() {
            return studyPeriod;
        }

        /**
         * Sets the value of the studyPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudyPeriod(String value) {
            this.studyPeriod = value;
        }

        /**
         * Gets the value of the reliability property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setReliability(PicklistField value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithLargeTextRemarks }
         *     
         */
        public PicklistFieldWithLargeTextRemarks getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithLargeTextRemarks }
         *     
         */
        public void setRationalReliability(PicklistFieldWithLargeTextRemarks value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setDataWaiving(PicklistField value) {
            this.dataWaiving = value;
        }

        /**
         * Gets the value of the dataWaivingJustification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataWaivingJustification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataWaivingJustification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PicklistFieldWithLargeTextRemarks }
         * 
         * 
         */
        public List<PicklistFieldWithLargeTextRemarks> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<PicklistFieldWithLargeTextRemarks>();
            }
            return this.dataWaivingJustification;
        }

        /**
         * Gets the value of the justificationForTypeOfInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificationForTypeOfInformation() {
            return justificationForTypeOfInformation;
        }

        /**
         * Sets the value of the justificationForTypeOfInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificationForTypeOfInformation(String value) {
            this.justificationForTypeOfInformation = value;
        }

        /**
         * Gets the value of the attachedJustification property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference value) {
            this.crossReference = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
         *                   &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class AttachedJustification {

            protected List<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.AttachedJustification.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
             *         &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attachedJustification",
                "reasonPurpose"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "AttachedJustification", required = true)
                protected String attachedJustification;
                @XmlElement(name = "ReasonPurpose", required = true)
                protected PicklistFieldWithSmallTextRemarks reasonPurpose;

                /**
                 * Gets the value of the attachedJustification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttachedJustification() {
                    return attachedJustification;
                }

                /**
                 * Sets the value of the attachedJustification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttachedJustification(String value) {
                    this.attachedJustification = value;
                }

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setReasonPurpose(PicklistFieldWithSmallTextRemarks value) {
                    this.reasonPurpose = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class CrossReference {

            protected List<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.AdministrativeData.CrossReference.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reasonPurpose",
                "relatedInformation",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "ReasonPurpose", required = true)
                protected PicklistFieldWithSmallTextRemarks reasonPurpose;
                @XmlElement(name = "RelatedInformation", required = true)
                protected String relatedInformation;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setReasonPurpose(PicklistFieldWithSmallTextRemarks value) {
                    this.reasonPurpose = value;
                }

                /**
                 * Gets the value of the relatedInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelatedInformation() {
                    return relatedInformation;
                }

                /**
                 * Sets the value of the relatedInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelatedInformation(String value) {
                    this.relatedInformation = value;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemarks() {
                    return remarks;
                }

                /**
                 * Sets the value of the remarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemarks(String value) {
                    this.remarks = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InterpretationOfResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *         &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interpretationOfResults",
        "conclusions",
        "executiveSummary"
    })
    public static class ApplicantSummaryAndConclusion {

        @XmlElement(name = "InterpretationOfResults", required = true)
        protected PicklistFieldWithMultiLineTextRemarks interpretationOfResults;
        @XmlElement(name = "Conclusions", required = true)
        protected String conclusions;
        @XmlElement(name = "ExecutiveSummary", required = true)
        protected String executiveSummary;

        /**
         * Gets the value of the interpretationOfResults property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithMultiLineTextRemarks }
         *     
         */
        public PicklistFieldWithMultiLineTextRemarks getInterpretationOfResults() {
            return interpretationOfResults;
        }

        /**
         * Sets the value of the interpretationOfResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithMultiLineTextRemarks }
         *     
         */
        public void setInterpretationOfResults(PicklistFieldWithMultiLineTextRemarks value) {
            this.interpretationOfResults = value;
        }

        /**
         * Gets the value of the conclusions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConclusions() {
            return conclusions;
        }

        /**
         * Sets the value of the conclusions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConclusions(String value) {
            this.conclusions = value;
        }

        /**
         * Gets the value of the executiveSummary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutiveSummary() {
            return executiveSummary;
        }

        /**
         * Sets the value of the executiveSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutiveSummary(String value) {
            this.executiveSummary = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
     *         &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reference",
        "dataAccess",
        "dataProtectionClaimed"
    })
    public static class DataSource {

        @XmlElement(name = "Reference", required = true)
        protected DocumentReferenceMultipleField reference;
        @XmlElement(name = "DataAccess", required = true)
        protected PicklistFieldWithSmallTextRemarks dataAccess;
        @XmlElement(name = "DataProtectionClaimed", required = true)
        protected PicklistFieldWithSmallTextRemarks dataProtectionClaimed;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentReferenceMultipleField }
         *     
         */
        public DocumentReferenceMultipleField getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentReferenceMultipleField }
         *     
         */
        public void setReference(DocumentReferenceMultipleField value) {
            this.reference = value;
        }

        /**
         * Gets the value of the dataAccess property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setDataAccess(PicklistFieldWithSmallTextRemarks value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setDataProtectionClaimed(PicklistFieldWithSmallTextRemarks value) {
            this.dataProtectionClaimed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Guideline">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *                             &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="GLPComplianceStatement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="OtherQualityAssurance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="TestMaterials">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
     *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guideline",
        "methodNoGuideline",
        "glpComplianceStatement",
        "otherQualityAssurance",
        "testMaterials",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "Guideline", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline guideline;
        @XmlElement(name = "MethodNoGuideline", required = true)
        protected String methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement", required = true)
        protected PicklistFieldWithSmallTextRemarks glpComplianceStatement;
        @XmlElement(name = "OtherQualityAssurance", required = true)
        protected PicklistFieldWithSmallTextRemarks otherQualityAssurance;
        @XmlElement(name = "TestMaterials", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline value) {
            this.guideline = value;
        }

        /**
         * Gets the value of the methodNoGuideline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethodNoGuideline() {
            return methodNoGuideline;
        }

        /**
         * Sets the value of the methodNoGuideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethodNoGuideline(String value) {
            this.methodNoGuideline = value;
        }

        /**
         * Gets the value of the glpComplianceStatement property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getGLPComplianceStatement() {
            return glpComplianceStatement;
        }

        /**
         * Sets the value of the glpComplianceStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setGLPComplianceStatement(PicklistFieldWithSmallTextRemarks value) {
            this.glpComplianceStatement = value;
        }

        /**
         * Gets the value of the otherQualityAssurance property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getOtherQualityAssurance() {
            return otherQualityAssurance;
        }

        /**
         * Sets the value of the otherQualityAssurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setOtherQualityAssurance(PicklistFieldWithSmallTextRemarks value) {
            this.otherQualityAssurance = value;
        }

        /**
         * Gets the value of the testMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
            this.anyOtherInformationOnMaterialsAndMethodsInclTables = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherInformation"
        })
        public static class AnyOtherInformationOnMaterialsAndMethodsInclTables {

            @XmlElement(name = "OtherInformation", required = true)
            protected String otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInformation() {
                return otherInformation;
            }

            /**
             * Sets the value of the otherInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInformation(String value) {
                this.otherInformation = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *                   &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class Guideline {

            protected List<ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.MaterialsAndMethods.Guideline.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
             *         &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "qualifier",
                "guideline",
                "versionRemarks",
                "deviation"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Qualifier", required = true)
                protected PicklistField qualifier;
                @XmlElement(name = "Guideline", required = true)
                protected PicklistField guideline;
                @XmlElement(name = "VersionRemarks", required = true)
                protected String versionRemarks;
                @XmlElement(name = "Deviation", required = true)
                protected PicklistFieldWithSmallTextRemarks deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setQualifier(PicklistField value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setGuideline(PicklistField value) {
                    this.guideline = value;
                }

                /**
                 * Gets the value of the versionRemarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersionRemarks() {
                    return versionRemarks;
                }

                /**
                 * Sets the value of the versionRemarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersionRemarks(String value) {
                    this.versionRemarks = value;
                }

                /**
                 * Gets the value of the deviation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setDeviation(PicklistFieldWithSmallTextRemarks value) {
                    this.deviation = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
         *         &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "testMaterialInformation",
            "specificDetailsOnTestMaterialUsedForTheStudy"
        })
        public static class TestMaterials {

            @XmlElement(name = "TestMaterialInformation", required = true)
            protected String testMaterialInformation;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudy", required = true)
            protected String specificDetailsOnTestMaterialUsedForTheStudy;

            /**
             * Gets the value of the testMaterialInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTestMaterialInformation() {
                return testMaterialInformation;
            }

            /**
             * Sets the value of the testMaterialInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTestMaterialInformation(String value) {
                this.testMaterialInformation = value;
            }

            /**
             * Gets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecificDetailsOnTestMaterialUsedForTheStudy() {
                return specificDetailsOnTestMaterialUsedForTheStudy;
            }

            /**
             * Sets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecificDetailsOnTestMaterialUsedForTheStudy(String value) {
                this.specificDetailsOnTestMaterialUsedForTheStudy = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *         &lt;element name="AttachedBackgroundMaterial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField"/>
     *         &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remarksOnResults",
        "attachedBackgroundMaterial",
        "attachedStudyReport",
        "illustrationPicGraph"
    })
    public static class OverallRemarksAttachments {

        @XmlElement(name = "RemarksOnResults", required = true)
        protected String remarksOnResults;
        @XmlElement(name = "AttachedBackgroundMaterial", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
        @XmlElement(name = "AttachedStudyReport", required = true)
        protected AttachmentListField attachedStudyReport;
        @XmlElement(name = "IllustrationPicGraph", required = true)
        protected String illustrationPicGraph;

        /**
         * Gets the value of the remarksOnResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarksOnResults() {
            return remarksOnResults;
        }

        /**
         * Sets the value of the remarksOnResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarksOnResults(String value) {
            this.remarksOnResults = value;
        }

        /**
         * Gets the value of the attachedBackgroundMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
            this.attachedBackgroundMaterial = value;
        }

        /**
         * Gets the value of the attachedStudyReport property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListField }
         *     
         */
        public AttachmentListField getAttachedStudyReport() {
            return attachedStudyReport;
        }

        /**
         * Sets the value of the attachedStudyReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListField }
         *     
         */
        public void setAttachedStudyReport(AttachmentListField value) {
            this.attachedStudyReport = value;
        }

        /**
         * Gets the value of the illustrationPicGraph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIllustrationPicGraph() {
            return illustrationPicGraph;
        }

        /**
         * Sets the value of the illustrationPicGraph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIllustrationPicGraph(String value) {
            this.illustrationPicGraph = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class AttachedBackgroundMaterial {

            protected List<ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attachedDocument",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "AttachedDocument", required = true)
                protected String attachedDocument;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

                /**
                 * Gets the value of the attachedDocument property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttachedDocument() {
                    return attachedDocument;
                }

                /**
                 * Sets the value of the attachedDocument property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttachedDocument(String value) {
                    this.attachedDocument = value;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemarks() {
                    return remarks;
                }

                /**
                 * Sets the value of the remarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemarks(String value) {
                    this.remarks = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlammableGasesLowerAndUpperExplosionLimit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Aerosols">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TypeOfAerosolTested" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="ContentOfFlammableComponents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="TestParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlammableSolids">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="BurningTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="MoistureWt" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PyrophoricSolids">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="Temp" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value=""/>
     *                                             &lt;enumeration value="2493"/>
     *                                             &lt;enumeration value="3887"/>
     *                                             &lt;enumeration value="3888"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="unitOther" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="value" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PyrophoricLiquids">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="Temp" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value=""/>
     *                                             &lt;enumeration value="2493"/>
     *                                             &lt;enumeration value="3887"/>
     *                                             &lt;enumeration value="3888"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="unitOther" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="value" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SelfHeatingSubstancesMixtures">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="MaxTempReached" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                             &lt;element name="InductionTimeH" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                             &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SubstancesMixturesWhichInContactWithWaterEmitFlammableGases">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *                             &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="MaxRateOfGasRelease" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value=""/>
     *                                             &lt;enumeration value="60424"/>
     *                                             &lt;enumeration value="60425"/>
     *                                             &lt;enumeration value="1342"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="unitOther" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="value" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="IdentityOfEvolvedGas" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnyOtherInformationOnResultsInclTables">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flammableGasesLowerAndUpperExplosionLimit",
        "aerosols",
        "flammableSolids",
        "pyrophoricSolids",
        "pyrophoricLiquids",
        "selfHeatingSubstancesMixtures",
        "substancesMixturesWhichInContactWithWaterEmitFlammableGases",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "FlammableGasesLowerAndUpperExplosionLimit", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit flammableGasesLowerAndUpperExplosionLimit;
        @XmlElement(name = "Aerosols", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols aerosols;
        @XmlElement(name = "FlammableSolids", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids flammableSolids;
        @XmlElement(name = "PyrophoricSolids", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids pyrophoricSolids;
        @XmlElement(name = "PyrophoricLiquids", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids pyrophoricLiquids;
        @XmlElement(name = "SelfHeatingSubstancesMixtures", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures selfHeatingSubstancesMixtures;
        @XmlElement(name = "SubstancesMixturesWhichInContactWithWaterEmitFlammableGases", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases substancesMixturesWhichInContactWithWaterEmitFlammableGases;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
        protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the flammableGasesLowerAndUpperExplosionLimit property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit getFlammableGasesLowerAndUpperExplosionLimit() {
            return flammableGasesLowerAndUpperExplosionLimit;
        }

        /**
         * Sets the value of the flammableGasesLowerAndUpperExplosionLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit }
         *     
         */
        public void setFlammableGasesLowerAndUpperExplosionLimit(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit value) {
            this.flammableGasesLowerAndUpperExplosionLimit = value;
        }

        /**
         * Gets the value of the aerosols property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols getAerosols() {
            return aerosols;
        }

        /**
         * Sets the value of the aerosols property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols }
         *     
         */
        public void setAerosols(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols value) {
            this.aerosols = value;
        }

        /**
         * Gets the value of the flammableSolids property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids getFlammableSolids() {
            return flammableSolids;
        }

        /**
         * Sets the value of the flammableSolids property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids }
         *     
         */
        public void setFlammableSolids(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids value) {
            this.flammableSolids = value;
        }

        /**
         * Gets the value of the pyrophoricSolids property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids getPyrophoricSolids() {
            return pyrophoricSolids;
        }

        /**
         * Sets the value of the pyrophoricSolids property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids }
         *     
         */
        public void setPyrophoricSolids(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids value) {
            this.pyrophoricSolids = value;
        }

        /**
         * Gets the value of the pyrophoricLiquids property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids getPyrophoricLiquids() {
            return pyrophoricLiquids;
        }

        /**
         * Sets the value of the pyrophoricLiquids property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids }
         *     
         */
        public void setPyrophoricLiquids(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids value) {
            this.pyrophoricLiquids = value;
        }

        /**
         * Gets the value of the selfHeatingSubstancesMixtures property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures getSelfHeatingSubstancesMixtures() {
            return selfHeatingSubstancesMixtures;
        }

        /**
         * Sets the value of the selfHeatingSubstancesMixtures property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures }
         *     
         */
        public void setSelfHeatingSubstancesMixtures(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures value) {
            this.selfHeatingSubstancesMixtures = value;
        }

        /**
         * Gets the value of the substancesMixturesWhichInContactWithWaterEmitFlammableGases property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases getSubstancesMixturesWhichInContactWithWaterEmitFlammableGases() {
            return substancesMixturesWhichInContactWithWaterEmitFlammableGases;
        }

        /**
         * Sets the value of the substancesMixturesWhichInContactWithWaterEmitFlammableGases property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases }
         *     
         */
        public void setSubstancesMixturesWhichInContactWithWaterEmitFlammableGases(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases value) {
            this.substancesMixturesWhichInContactWithWaterEmitFlammableGases = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
            this.anyOtherInformationOnResultsInclTables = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TypeOfAerosolTested" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="ContentOfFlammableComponents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="TestParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class Aerosols {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.Aerosols.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TypeOfAerosolTested" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="ContentOfFlammableComponents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="TestParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "typeOfAerosolTested",
                "contentOfFlammableComponents",
                "testParameter",
                "value",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TypeOfAerosolTested", required = true)
                protected PicklistFieldWithSmallTextRemarks typeOfAerosolTested;
                @XmlElement(name = "ContentOfFlammableComponents", required = true)
                protected PhysicalQuantityRangeField contentOfFlammableComponents;
                @XmlElement(name = "TestParameter", required = true)
                protected PicklistFieldWithSmallTextRemarks testParameter;
                @XmlElement(name = "Value", required = true)
                protected PhysicalQuantityRangeField value;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the typeOfAerosolTested property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTypeOfAerosolTested() {
                    return typeOfAerosolTested;
                }

                /**
                 * Sets the value of the typeOfAerosolTested property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTypeOfAerosolTested(PicklistFieldWithSmallTextRemarks value) {
                    this.typeOfAerosolTested = value;
                }

                /**
                 * Gets the value of the contentOfFlammableComponents property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getContentOfFlammableComponents() {
                    return contentOfFlammableComponents;
                }

                /**
                 * Sets the value of the contentOfFlammableComponents property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setContentOfFlammableComponents(PhysicalQuantityRangeField value) {
                    this.contentOfFlammableComponents = value;
                }

                /**
                 * Gets the value of the testParameter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTestParameter() {
                    return testParameter;
                }

                /**
                 * Sets the value of the testParameter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTestParameter(PicklistFieldWithSmallTextRemarks value) {
                    this.testParameter = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setValue(PhysicalQuantityRangeField value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherInformation"
        })
        public static class AnyOtherInformationOnResultsInclTables {

            @XmlElement(name = "OtherInformation", required = true)
            protected String otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInformation() {
                return otherInformation;
            }

            /**
             * Sets the value of the otherInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInformation(String value) {
                this.otherInformation = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class FlammableGasesLowerAndUpperExplosionLimit {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableGasesLowerAndUpperExplosionLimit.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="Value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "parameter",
                "value",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "Parameter", required = true)
                protected PicklistFieldWithSmallTextRemarks parameter;
                @XmlElement(name = "Value", required = true)
                protected PhysicalQuantityRangeField value;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the parameter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getParameter() {
                    return parameter;
                }

                /**
                 * Sets the value of the parameter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setParameter(PicklistFieldWithSmallTextRemarks value) {
                    this.parameter = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setValue(PhysicalQuantityRangeField value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="BurningTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="MoistureWt" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class FlammableSolids {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.FlammableSolids.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="BurningTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="MoistureWt" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "testProcedure",
                "burningTime",
                "moistureWt",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TestProcedure", required = true)
                protected PicklistFieldWithSmallTextRemarks testProcedure;
                @XmlElement(name = "BurningTime", required = true)
                protected PhysicalQuantityRangeField burningTime;
                @XmlElement(name = "MoistureWt", required = true, nillable = true)
                protected BigDecimal moistureWt;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the testProcedure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTestProcedure() {
                    return testProcedure;
                }

                /**
                 * Sets the value of the testProcedure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTestProcedure(PicklistFieldWithSmallTextRemarks value) {
                    this.testProcedure = value;
                }

                /**
                 * Gets the value of the burningTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getBurningTime() {
                    return burningTime;
                }

                /**
                 * Sets the value of the burningTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setBurningTime(PhysicalQuantityRangeField value) {
                    this.burningTime = value;
                }

                /**
                 * Gets the value of the moistureWt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMoistureWt() {
                    return moistureWt;
                }

                /**
                 * Sets the value of the moistureWt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMoistureWt(BigDecimal value) {
                    this.moistureWt = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="Temp" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value=""/>
         *                                   &lt;enumeration value="2493"/>
         *                                   &lt;enumeration value="3887"/>
         *                                   &lt;enumeration value="3888"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="unitOther" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="value" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class PyrophoricLiquids {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="Temp" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value=""/>
             *                         &lt;enumeration value="2493"/>
             *                         &lt;enumeration value="3887"/>
             *                         &lt;enumeration value="3888"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="unitOther" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="value" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "testProcedure",
                "results",
                "temp",
                "relativeAirHumidity",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TestProcedure", required = true)
                protected PicklistFieldWithSmallTextRemarks testProcedure;
                @XmlElement(name = "Results", required = true)
                protected PhysicalQuantityRangeField results;
                @XmlElement(name = "Temp")
                protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry.Temp temp;
                @XmlElement(name = "RelativeAirHumidity", required = true, nillable = true)
                protected BigDecimal relativeAirHumidity;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the testProcedure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTestProcedure() {
                    return testProcedure;
                }

                /**
                 * Sets the value of the testProcedure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTestProcedure(PicklistFieldWithSmallTextRemarks value) {
                    this.testProcedure = value;
                }

                /**
                 * Gets the value of the results property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getResults() {
                    return results;
                }

                /**
                 * Sets the value of the results property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setResults(PhysicalQuantityRangeField value) {
                    this.results = value;
                }

                /**
                 * Gets the value of the temp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry.Temp }
                 *     
                 */
                public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry.Temp getTemp() {
                    return temp;
                }

                /**
                 * Sets the value of the temp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry.Temp }
                 *     
                 */
                public void setTemp(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricLiquids.Entry.Temp value) {
                    this.temp = value;
                }

                /**
                 * Gets the value of the relativeAirHumidity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRelativeAirHumidity() {
                    return relativeAirHumidity;
                }

                /**
                 * Sets the value of the relativeAirHumidity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRelativeAirHumidity(BigDecimal value) {
                    this.relativeAirHumidity = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value=""/>
                 *               &lt;enumeration value="2493"/>
                 *               &lt;enumeration value="3887"/>
                 *               &lt;enumeration value="3888"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="unitOther" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="value" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "unitCode",
                    "unitOther",
                    "value"
                })
                public static class Temp
                    extends PhysicalQuantityField
                {

                    protected String unitCode;
                    protected String unitOther;
                    protected String value;

                    /**
                     * Gets the value of the unitCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitCode() {
                        return unitCode;
                    }

                    /**
                     * Sets the value of the unitCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitCode(String value) {
                        this.unitCode = value;
                    }

                    /**
                     * Gets the value of the unitOther property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitOther() {
                        return unitOther;
                    }

                    /**
                     * Sets the value of the unitOther property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitOther(String value) {
                        this.unitOther = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="Temp" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value=""/>
         *                                   &lt;enumeration value="2493"/>
         *                                   &lt;enumeration value="3887"/>
         *                                   &lt;enumeration value="3888"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="unitOther" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="value" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class PyrophoricSolids {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="Temp" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value=""/>
             *                         &lt;enumeration value="2493"/>
             *                         &lt;enumeration value="3887"/>
             *                         &lt;enumeration value="3888"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="unitOther" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="value" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RelativeAirHumidity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "testProcedure",
                "results",
                "temp",
                "relativeAirHumidity",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TestProcedure", required = true)
                protected PicklistFieldWithSmallTextRemarks testProcedure;
                @XmlElement(name = "Results", required = true)
                protected PhysicalQuantityRangeField results;
                @XmlElement(name = "Temp")
                protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry.Temp temp;
                @XmlElement(name = "RelativeAirHumidity", required = true, nillable = true)
                protected BigDecimal relativeAirHumidity;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the testProcedure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTestProcedure() {
                    return testProcedure;
                }

                /**
                 * Sets the value of the testProcedure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTestProcedure(PicklistFieldWithSmallTextRemarks value) {
                    this.testProcedure = value;
                }

                /**
                 * Gets the value of the results property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getResults() {
                    return results;
                }

                /**
                 * Sets the value of the results property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setResults(PhysicalQuantityRangeField value) {
                    this.results = value;
                }

                /**
                 * Gets the value of the temp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry.Temp }
                 *     
                 */
                public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry.Temp getTemp() {
                    return temp;
                }

                /**
                 * Sets the value of the temp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry.Temp }
                 *     
                 */
                public void setTemp(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.PyrophoricSolids.Entry.Temp value) {
                    this.temp = value;
                }

                /**
                 * Gets the value of the relativeAirHumidity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRelativeAirHumidity() {
                    return relativeAirHumidity;
                }

                /**
                 * Sets the value of the relativeAirHumidity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRelativeAirHumidity(BigDecimal value) {
                    this.relativeAirHumidity = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value=""/>
                 *               &lt;enumeration value="2493"/>
                 *               &lt;enumeration value="3887"/>
                 *               &lt;enumeration value="3888"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="unitOther" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="value" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "unitCode",
                    "unitOther",
                    "value"
                })
                public static class Temp
                    extends PhysicalQuantityField
                {

                    protected String unitCode;
                    protected String unitOther;
                    protected String value;

                    /**
                     * Gets the value of the unitCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitCode() {
                        return unitCode;
                    }

                    /**
                     * Sets the value of the unitCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitCode(String value) {
                        this.unitCode = value;
                    }

                    /**
                     * Gets the value of the unitOther property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitOther() {
                        return unitOther;
                    }

                    /**
                     * Sets the value of the unitOther property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitOther(String value) {
                        this.unitOther = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="MaxTempReached" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                   &lt;element name="InductionTimeH" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                   &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class SelfHeatingSubstancesMixtures {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SelfHeatingSubstancesMixtures.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="MaxTempReached" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *         &lt;element name="InductionTimeH" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *         &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "testProcedure",
                "maxTempReached",
                "inductionTimeH",
                "results",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TestProcedure", required = true)
                protected PicklistFieldWithSmallTextRemarks testProcedure;
                @XmlElement(name = "MaxTempReached", required = true, nillable = true)
                protected BigDecimal maxTempReached;
                @XmlElement(name = "InductionTimeH", required = true, nillable = true)
                protected BigDecimal inductionTimeH;
                @XmlElement(name = "Results", required = true)
                protected PicklistFieldWithSmallTextRemarks results;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the testProcedure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getTestProcedure() {
                    return testProcedure;
                }

                /**
                 * Sets the value of the testProcedure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setTestProcedure(PicklistFieldWithSmallTextRemarks value) {
                    this.testProcedure = value;
                }

                /**
                 * Gets the value of the maxTempReached property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMaxTempReached() {
                    return maxTempReached;
                }

                /**
                 * Sets the value of the maxTempReached property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMaxTempReached(BigDecimal value) {
                    this.maxTempReached = value;
                }

                /**
                 * Gets the value of the inductionTimeH property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getInductionTimeH() {
                    return inductionTimeH;
                }

                /**
                 * Sets the value of the inductionTimeH property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setInductionTimeH(BigDecimal value) {
                    this.inductionTimeH = value;
                }

                /**
                 * Gets the value of the results property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getResults() {
                    return results;
                }

                /**
                 * Sets the value of the results property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setResults(PicklistFieldWithSmallTextRemarks value) {
                    this.results = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                   &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="MaxRateOfGasRelease" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value=""/>
         *                                   &lt;enumeration value="60424"/>
         *                                   &lt;enumeration value="60425"/>
         *                                   &lt;enumeration value="1342"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="unitOther" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="value" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="IdentityOfEvolvedGas" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entry"
        })
        public static class SubstancesMixturesWhichInContactWithWaterEmitFlammableGases {

            protected List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *         &lt;element name="TestProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="MaxRateOfGasRelease" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value=""/>
             *                         &lt;enumeration value="60424"/>
             *                         &lt;enumeration value="60425"/>
             *                         &lt;enumeration value="1342"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="unitOther" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="value" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="IdentityOfEvolvedGas" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "keyResult",
                "testProcedure",
                "maxRateOfGasRelease",
                "identityOfEvolvedGas",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                protected Boolean keyResult;
                @XmlElement(name = "TestProcedure")
                protected List<PicklistFieldWithSmallTextRemarks> testProcedure;
                @XmlElement(name = "MaxRateOfGasRelease")
                protected ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry.MaxRateOfGasRelease maxRateOfGasRelease;
                @XmlElement(name = "IdentityOfEvolvedGas", required = true)
                protected PicklistFieldWithSmallTextRemarks identityOfEvolvedGas;
                @XmlElement(name = "RemarksOnResults", required = true)
                protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setKeyResult(Boolean value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the testProcedure property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the testProcedure property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTestProcedure().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PicklistFieldWithSmallTextRemarks }
                 * 
                 * 
                 */
                public List<PicklistFieldWithSmallTextRemarks> getTestProcedure() {
                    if (testProcedure == null) {
                        testProcedure = new ArrayList<PicklistFieldWithSmallTextRemarks>();
                    }
                    return this.testProcedure;
                }

                /**
                 * Gets the value of the maxRateOfGasRelease property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry.MaxRateOfGasRelease }
                 *     
                 */
                public ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry.MaxRateOfGasRelease getMaxRateOfGasRelease() {
                    return maxRateOfGasRelease;
                }

                /**
                 * Sets the value of the maxRateOfGasRelease property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry.MaxRateOfGasRelease }
                 *     
                 */
                public void setMaxRateOfGasRelease(ENDPOINTSTUDYRECORDFlammability.ResultsAndDiscussion.SubstancesMixturesWhichInContactWithWaterEmitFlammableGases.Entry.MaxRateOfGasRelease value) {
                    this.maxRateOfGasRelease = value;
                }

                /**
                 * Gets the value of the identityOfEvolvedGas property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getIdentityOfEvolvedGas() {
                    return identityOfEvolvedGas;
                }

                /**
                 * Sets the value of the identityOfEvolvedGas property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setIdentityOfEvolvedGas(PicklistFieldWithSmallTextRemarks value) {
                    this.identityOfEvolvedGas = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithMultiLineTextRemarks }
                 *     
                 */
                public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
                    this.remarksOnResults = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value=""/>
                 *               &lt;enumeration value="60424"/>
                 *               &lt;enumeration value="60425"/>
                 *               &lt;enumeration value="1342"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="unitOther" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="value" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "unitCode",
                    "unitOther",
                    "value"
                })
                public static class MaxRateOfGasRelease
                    extends PhysicalQuantityField
                {

                    protected String unitCode;
                    protected String unitOther;
                    protected String value;

                    /**
                     * Gets the value of the unitCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitCode() {
                        return unitCode;
                    }

                    /**
                     * Sets the value of the unitCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitCode(String value) {
                        this.unitCode = value;
                    }

                    /**
                     * Gets the value of the unitOther property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitOther() {
                        return unitOther;
                    }

                    /**
                     * Sets the value of the unitOther property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitOther(String value) {
                        this.unitOther = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }

    }

}
