export interface AnalysisRouting {
  id: number;
  fromId: string;
  toId: string;
  canCommunicate:boolean;
  message:string;
  lastModified:Date;
}
